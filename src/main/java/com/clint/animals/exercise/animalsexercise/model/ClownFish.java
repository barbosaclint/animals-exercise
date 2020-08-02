package com.clint.animals.exercise.animalsexercise.model;

import com.clint.animals.exercise.animalsexercise.action.IMakeJoke;
import com.clint.animals.exercise.animalsexercise.helper.Constants;

public class ClownFish extends Fish implements IMakeJoke {

    public String printQuirks(){

        return behaviorSwim() + "\n" + behaviorMakeJoke();
    }

    @Override
    public String behaviorMakeJoke() {
        return Constants.BEHAVIOR_MAKE_JOKE;
    }
}