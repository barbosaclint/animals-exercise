package com.clint.animals.exercise.animalsexercise.model;

import com.clint.animals.exercise.animalsexercise.action.IWalk;
import com.clint.animals.exercise.animalsexercise.helper.Constants;

public class Cat extends Animal implements IWalk {

    @Override
    public String behaviorWalk() {
        return Constants.ACTION_WALK;
    }
}
