package com.clint.animals.exercise.animalsexercise.model;

import com.clint.animals.exercise.animalsexercise.helper.Constants;

public class Chicken extends Bird {

    public String printQuirks(){

        return behaviorWalk() + "\n" + iSound();
    }

    @Override
    public String iSound() {
        return Constants.SOUND_CHICKEN;
    }
}
