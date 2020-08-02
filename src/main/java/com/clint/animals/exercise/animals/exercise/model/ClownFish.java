package com.clint.animals.exercise.animals.exercise.model;

import com.clint.animals.exercise.animals.exercise.action.IMakeJoke;
import com.clint.animals.exercise.animals.exercise.helper.Constants;

public class ClownFish extends Fish implements IMakeJoke {

    public String printQuirks(){

        return behaviorSwim() + "\n" + behaviorMakeJoke() + "\n" + color(Constants.COLOR_ORANGE) + "\n" + size(Constants.SIZE_SMALL);
    }

    @Override
    public String behaviorMakeJoke() {
        return Constants.ACTION_MAKE_JOKE;
    }
}
