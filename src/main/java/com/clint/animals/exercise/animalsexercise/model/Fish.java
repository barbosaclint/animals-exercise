package com.clint.animals.exercise.animalsexercise.model;

import com.clint.animals.exercise.animalsexercise.action.ISwim;
import com.clint.animals.exercise.animalsexercise.helper.Constants;

public class Fish extends Animal implements ISwim {

    @Override
    public String behaviorSwim() {

        return Constants.BEHAVIOR_SWIM;
    }
}
