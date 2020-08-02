package com.clint.animals.exercise.animalsexercise.model;

import com.clint.animals.exercise.animalsexercise.helper.Constants;

public class Rooster extends Chicken {

    public String printQuirks(){

        return behavior() + "\n" + sound();
    }

    public String behavior(){
        return Constants.BEHAVIOR_WALK;
    }

    public String sound(){
        return Constants.SOUND_ROOSTER;
    }


}
