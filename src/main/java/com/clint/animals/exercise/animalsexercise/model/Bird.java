package com.clint.animals.exercise.animalsexercise.model;

import com.clint.animals.exercise.animalsexercise.action.IFly;
import com.clint.animals.exercise.animalsexercise.action.ISing;
import com.clint.animals.exercise.animalsexercise.action.ISound;
import com.clint.animals.exercise.animalsexercise.action.IWalk;
import com.clint.animals.exercise.animalsexercise.helper.Constants;

public class Bird extends Animal implements IWalk, IFly, ISing, ISound {

    public String printQuirks(){

        return behaviorFly() + "\n" + behaviorSing() + "\n" + behaviorWalk();
    }

    @Override
    public String behaviorFly() {
        return Constants.BEHAVIOR_FLY;
    }

    @Override
    public String behaviorSing() {
        return Constants.BEHAVIOR_SING;
    }

    @Override
    public String behaviorWalk() {
        return Constants.BEHAVIOR_WALK;
    }

    @Override
    public String iSound() {
        return Constants.SOUND_BIRD;
    }
}
