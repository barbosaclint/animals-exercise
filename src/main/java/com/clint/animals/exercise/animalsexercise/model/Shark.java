package com.clint.animals.exercise.animalsexercise.model;

import com.clint.animals.exercise.animalsexercise.helper.Constants;

public class Shark extends Fish {

    public String printQuirks(){

        return behaviorSwim() + "\n" + color(Constants.COLOR_GRAY) + "\n" + size(Constants.SIZE_LARGE);
    }
}
