package com.clint.animals.exercise.animals.exercise.model;

import com.clint.animals.exercise.animals.exercise.action.IFly;
import com.clint.animals.exercise.animals.exercise.helper.Constants;

public class Butterfly extends Animal implements IFly {

    @Override
    public String behaviorFly() {
        return Constants.ACTION_FLY;
    }
}
