package com.example.najeebsakhizada.learningabstracandinterface;

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
