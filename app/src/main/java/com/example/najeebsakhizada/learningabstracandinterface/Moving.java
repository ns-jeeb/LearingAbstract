package com.example.najeebsakhizada.learningabstracandinterface;

/**
 * Created by Najeeb Sakhizada on 2014-07-23.
 */
public class Moving implements IMoving {

    @Override
    public String movement() {

        return "I can Walk fast and run ";
    }

    @Override
    public String makeSound() {

        return "I am barking";
    }

    @Override
    public String specie() {

        return "I am not specie";
    }
}
