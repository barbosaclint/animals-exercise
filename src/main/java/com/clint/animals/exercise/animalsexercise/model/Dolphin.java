package com.clint.animals.exercise.animalsexercise.model;

import com.clint.animals.exercise.animalsexercise.action.ISwim;
import com.clint.animals.exercise.animalsexercise.helper.Constants;

public class Dolphin extends Animal implements ISwim {

    public String printQuirks(){

        return behaviorSwim() ;
    }

    @Override
    public String behaviorSwim() {
        return Constants.ACTION_SWIM;
    }
}
