package com.example.najeebsakhizada.learningabstracandinterface.animals_adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.najeebsakhizada.learningabstracandinterface.models.Dog;
import com.example.najeebsakhizada.learningabstracandinterface.models.DogNames;
import com.example.najeebsakhizada.learningabstracandinterface.R;

/**
 * Created by Najeeb Sakhizada on 2014-07-24.
 */
public class DogAdapter extends BaseAdapter {

    DogNames mDog;
    Context mContext;
    TextView lblName, lblMove, lblSound;
    Dog mDogMove;

    public DogAdapter(Context context){
        mDog = new DogNames(context);
        mContext = context;
        mDogMove = new Dog();
    }

    @Override
    public int getCount() {

        return mDog.getDogNames().size() ;
    }

    @Override
    public Object getItem(int position) {

        return mDog.getDogNames().get(position);
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.fragment_my,parent, false);
        }
        lblName = (TextView)convertView.findViewById(R.id.lbl_name);
        lblMove = (TextView)convertView.findViewById(R.id.lbl_num_of_legs);
        lblSound = (TextView)convertView.findViewById(R.id.lbl_sound);
        setModole(position);

        return convertView;
    }

    private void setModole(int position) {
        lblName.setText(mDog.getDogNames().get(position));
        lblMove.setText(mDogMove.mMovingType.movement());
        lblSound.setText(mDogMove.mMovingType.makeSound());
    }
}
