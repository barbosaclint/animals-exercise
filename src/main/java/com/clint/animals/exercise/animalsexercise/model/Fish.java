package com.clint.animals.exercise.animalsexercise.model;

import com.clint.animals.exercise.animalsexercise.action.ISwim;
import com.clint.animals.exercise.animalsexercise.helper.Constants;

public class Fish extends Animal implements ISwim {

    public String printQuirks(){

        return behaviorSwim() + "\n" + color(null) + "\n" + size(null);
    }

    public String color(String color){

        return "Fish color is " + (color != null ? color : Constants.COLOR_NO);
    }

    public String size(String size){

        return "Fish body size is "+ (size != null ? size : Constants.SIZE_NO);
    }

    @Override
    public String behaviorSwim() {

        return Constants.BEHAVIOR_SWIM;
    }
}
