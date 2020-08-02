package com.clint.animals.exercise.animals.exercise.model;

import com.clint.animals.exercise.animals.exercise.helper.Constants;

public class Rooster extends Chicken {

    public String printQuirks(){

        return behavior() + "\n" + sound();
    }

    public String behavior(){
        return Constants.ACTION_WALK;
    }

    public String sound(){
        return Constants.SOUND_ROOSTER;
    }


}
