package com.example.najeebsakhizada.learningabstracandinterface.models;

import com.example.najeebsakhizada.learningabstracandinterface.Moving;
import com.example.najeebsakhizada.learningabstracandinterface.models.Animals;

/**
 * Created by Najeeb Sakhizada on 2014-07-08.
 */
public class Dog extends Animals {
    private String sound;


    public Dog(){
        super();

        mMovingType = new Moving();

    }

    public String getSound() {

        return sound;
    }

    public void setSound(String sound) {

        this.sound = sound;
    }






}
