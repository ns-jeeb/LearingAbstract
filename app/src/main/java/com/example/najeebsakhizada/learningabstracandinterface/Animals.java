package com.example.najeebsakhizada.learningabstracandinterface;

import java.util.ArrayList;

/**
 * Created by Najeeb Sakhizada on 2014-07-08.
 */
public class Animals {
    private String mName;
    private int mNumOfLegs;
    public IMoving mMovingType;

    public ArrayList<String> getListAnimalNames() {

        return mListAnimalNames;
    }

    public void setListAnimalNames(ArrayList<String> listAnimalNames) {

        mListAnimalNames = listAnimalNames;
    }

    ArrayList<String> mListAnimalNames;


    public String getName() {

        return mName;
    }

    public void setName(String name) {

        mName = name;
    }

    public int getNumOfLegs() {

        return mNumOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {

        mNumOfLegs = numOfLegs;
    }
    public String tryingToMove(){
        return mMovingType.movement();
    }
}
