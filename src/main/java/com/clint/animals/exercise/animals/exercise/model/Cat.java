package com.clint.animals.exercise.animals.exercise.model;

import com.clint.animals.exercise.animals.exercise.action.IWalk;
import com.clint.animals.exercise.animals.exercise.helper.Constants;

public class Cat extends Animal implements IWalk {

    @Override
    public String behaviorWalk() {
        return Constants.ACTION_WALK;
    }
}
