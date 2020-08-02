package com.clint.animals.exercise.animals.exercise.model;

import com.clint.animals.exercise.animals.exercise.action.ISwim;
import com.clint.animals.exercise.animals.exercise.helper.Constants;

public class Dolphin extends Animal implements ISwim {

    public String printQuirks(){

        return behaviorSwim() ;
    }

    @Override
    public String behaviorSwim() {
        return Constants.ACTION_SWIM;
    }
}
