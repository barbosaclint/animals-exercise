package com.clint.animals.exercise.animals.exercise.model;

import com.clint.animals.exercise.animals.exercise.action.IFly;
import com.clint.animals.exercise.animals.exercise.action.ISing;
import com.clint.animals.exercise.animals.exercise.action.IWalk;
import com.clint.animals.exercise.animals.exercise.action.ISound;
import com.clint.animals.exercise.animals.exercise.helper.Constants;

public class Bird extends Animal implements IWalk, IFly, ISing, ISound {

    public String printQuirks(){

        return behaviorFly() + "\n" + behaviorSing() + "\n" + behaviorWalk();
    }

    @Override
    public String behaviorFly() {
        return Constants.ACTION_FLY;
    }

    @Override
    public String behaviorSing() {
        return Constants.ACTION_SING;
    }

    @Override
    public String behaviorWalk() {
        return Constants.ACTION_WALK;
    }

    @Override
    public String iSound() {
        return Constants.SOUND_BIRD;
    }
}
