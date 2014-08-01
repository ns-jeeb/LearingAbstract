package com.example.najeebsakhizada.learningabstracandinterface.models;

import com.example.najeebsakhizada.learningabstracandinterface.Flying;
import com.example.najeebsakhizada.learningabstracandinterface.models.Animals;

/**
 * Created by Najeeb Sakhizada on 2014-07-24.
 */
public class Bird extends Animals {
    public Bird(){
        super();
        mMovingType = new Flying();
    }
}
