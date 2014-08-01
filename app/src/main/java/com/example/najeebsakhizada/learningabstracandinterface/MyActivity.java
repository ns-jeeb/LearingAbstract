package com.example.najeebsakhizada.learningabstracandinterface;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.najeebsakhizada.learningabstracandinterface.animals_adapter.DogAdapter;
import com.example.najeebsakhizada.learningabstracandinterface.models.Animals;
import com.example.najeebsakhizada.learningabstracandinterface.models.Dog;
import com.example.najeebsakhizada.learningabstracandinterface.models.DogNames;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class MyActivity extends SingleActivity {

    @Override
    protected Fragment createFragment() {

        return new PlaceholderFragment();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        public TextView lblMove,lblsound,lblSpecie;
        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

            final Animals dog = new Dog();
            dog.mMovingType.movement();

            View rootView = inflater.inflate(R.layout.dog_list_view, container, false);
            DogAdapter dogAdapter = new DogAdapter(getActivity());

            ListView listView = (ListView)rootView.findViewById(R.id.dog_list);
            listView.setAdapter(dogAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    DogNames dogNames = new DogNames(getActivity());


                    Toast.makeText(getActivity(),dogNames.getDogNames().get(position) +" "+dog.mMovingType.specie(),Toast.LENGTH_SHORT).show();
                }
            });

            return rootView;
        }
    }


    static String TAG_TITLE = "title";
    static String TAG_ID = "id";
    static String TAG_HEADLINE = "headlines";
    static String TAG_DESCRIPTION = "description";
    static String TAG_IMAGES = "images";
    static String TAG_IMAGE_URL = "url";
    JSONObject mJasonData;
    Story story;



    public List<Story> fetchedStories(String jStory) {

        List<Story> listOfStory = new ArrayList<Story>();
        story = new Story();


        try {
            String title= null;
            int    storyId = 0;
            String type;
            String headline = null;
            String description= null;
            String url= null;

            mJasonData = new JSONObject(jStory);
            JSONArray jHeadlines = mJasonData.getJSONArray(TAG_HEADLINE);

            for (int i =0; i<jHeadlines.length();i++){

                JSONObject jHeadline = jHeadlines.getJSONObject(i);
               title = jHeadline.getString(TAG_TITLE);
                storyId = Integer.parseInt(jHeadline.getString(TAG_ID));
                headline = jHeadline.getString(TAG_HEADLINE);
                description = jHeadline.getString(TAG_DESCRIPTION);

            }


            JSONArray imageArray = mJasonData.getJSONArray(TAG_IMAGES);
            JSONObject jsonImage = converArrayToJson(imageArray);
            url = jsonImage.getString(TAG_IMAGE_URL);


            story.setTitle(title);
            story.setTitle(headline);
            story.setFullStory(description);
            story.setImage(url);


            for (int i=0; i <mJasonData.length(); i++){
                listOfStory.add(story);
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }

        return listOfStory;

    }



//    creating or adding list of stories

    public List<Object> addingStoryList(JSONObject jsonStory) {

        List<Object> stories = new ArrayList<Object>();
        for (int i = 0; i < jsonStory.length(); i++) {
            stories.add(story.getFullStory());
//            storyId = story.getID();
//            String id = "" + storyId;
//            stories.add(id);
            stories.add(story.getFullStory());
            stories.add(story.getFullStory());
            stories.add(story.getImage());
            stories.add(story.getFullStory());

        }
        return stories;
    }

    //        convert json array string object and fetching url from Images array.

    public JSONObject converArrayToJson(JSONArray images) throws JSONException {

        JSONObject jsonImage = new JSONObject();
        for (int i = 0; i < images.length(); i++) {

            jsonImage = images.getJSONObject(i);

        }
        return jsonImage;
    }

}
