package com.example.najeebsakhizada.learningabstracandinterface;

/**
 * Created by Najeeb Sakhizada on 2014-07-23.
 */
public class Flying implements IMoving {

    @Override
    public String movement() {

        return "Flying High No one compete me ";
    }

    @Override
    public String makeSound() {

        return " I do waq waq";
    }

    @Override
    public String specie() {

        return " I am not specie";
    }
}
