package com.example.najeebsakhizada.learningabstracandinterface;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Najeeb Sakhizada on 2014-07-24.
 */
public class DogNames {

    List<String> mDogNames;

    public DogNames(Context context){

        Resources res = context.getResources();
        mDogNames = new ArrayList<String>();
        String[] dogNames = res.getStringArray(R.array.dog_names);

        mDogNames = Arrays.asList(dogNames);

    }
    public List<String> getDogNames() {

        return mDogNames;
    }

    public void setDogNames(List<String> dogNames) {

        mDogNames = dogNames;
    }

}
