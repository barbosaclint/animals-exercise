package com.clint.animals.exercise.animals.exercise.model;

import com.clint.animals.exercise.animals.exercise.action.ISwim;
import com.clint.animals.exercise.animals.exercise.helper.Constants;

public class Duck extends Bird implements ISwim {

    public String printQuirks(){

        return behaviorFly() + "\n" + behaviorSwim() + "\n" + behaviorWalk() + "\n" + iSound();
    }

    @Override
    public String behaviorSwim() {
        return Constants.ACTION_SWIM;
    }

    @Override
    public String iSound() {
        return Constants.SOUND_DUCK;
    }

}
