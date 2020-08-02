package com.clint.animals.exercise.animals.exercise.model;

import com.clint.animals.exercise.animals.exercise.helper.Constants;

public class Shark extends Fish {

    public String printQuirks(){

        return behaviorSwim() + "\n" + color(Constants.COLOR_GRAY) + "\n" + size(Constants.SIZE_LARGE);
    }
}
