package com.clint.animals.exercise.animals.exercise.model;

import com.clint.animals.exercise.animals.exercise.helper.Constants;

public class Parrot extends Bird{

    public String printQuirks(){

        return behaviorWalk() + "\n" + behaviorFly() + "\n"  +  behaviorSing() + "\n" + parrotSoundWithSomething(null);
    }

    public String printQuirks(String something){

        return behaviorWalk() + "\n" + behaviorFly() + "\n"  +  behaviorSing() + "\n" + parrotSoundWithSomething(something);
    }

    public String parrotSoundWithSomething(String something){

        String sound = Constants.SOUND_PARROT;

        if (Constants.SOMETHING_DOG.equals(something)){
            sound = Constants.SOUND_DOG;

        } else if (Constants.SOMETHING_CAT.equals(something)){
            sound = Constants.SOUND_CAT;

        } else if (Constants.SOMETHING_ROOSTER.equals(something)){
            sound = Constants.SOUND_ROOSTER;

        } else if (Constants.SOMETHING_DUCK.equals(something)){
            sound = Constants.SOUND_DUCK;

        } else if (Constants.SOMETHING_PHONE.equals(something)){
            sound = Constants.SOUND_PHONE;

        }

        return sound;

    }
}
