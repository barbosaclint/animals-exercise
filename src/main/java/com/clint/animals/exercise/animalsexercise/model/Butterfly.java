package com.clint.animals.exercise.animalsexercise.model;

import com.clint.animals.exercise.animalsexercise.action.IFly;
import com.clint.animals.exercise.animalsexercise.helper.Constants;

public class Butterfly extends Animal implements IFly {

    @Override
    public String behaviorFly() {
        return Constants.ACTION_FLY;
    }
}
