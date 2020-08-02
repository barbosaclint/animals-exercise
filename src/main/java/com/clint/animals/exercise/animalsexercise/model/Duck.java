package com.clint.animals.exercise.animalsexercise.model;

import com.clint.animals.exercise.animalsexercise.action.ISwim;
import com.clint.animals.exercise.animalsexercise.helper.Constants;

public class Duck extends Bird implements ISwim {

    public String printQuirks(){

        return behaviorFly() + "\n" + behaviorSwim() + "\n" + behaviorWalk() + "\n" + iSound();
    }

    @Override
    public String behaviorSwim() {
        return Constants.BEHAVIOR_SWIM;
    }

    @Override
    public String iSound() {
        return Constants.SOUND_DUCK;
    }

}
