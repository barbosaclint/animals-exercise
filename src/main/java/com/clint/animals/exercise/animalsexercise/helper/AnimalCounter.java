package com.clint.animals.exercise.animalsexercise.helper;

import com.clint.animals.exercise.animalsexercise.action.*;
import com.clint.animals.exercise.animalsexercise.model.Animal;

public class AnimalCounter {

    public static Animal countAnimal(Animal[] animalArr) {

        Animal animal = new Animal();

        int flyAnimal = 0;
        int walkAnimal = 0;
        int singAnimal = 0;
        int swimAnimal = 0;
        int jokeAnimal = 0;

        String animalCount = new String();

        for (int i = 0; i < animalArr.length; i++) {
            if (animalArr[i] instanceof IFly) {
                flyAnimal += 1;
            }

            if (animalArr[i] instanceof IWalk) {
                walkAnimal += 1;
            }

            if (animalArr[i] instanceof ISing) {
                singAnimal += 1;
            }

            if (animalArr[i] instanceof ISwim) {
                swimAnimal += 1;
            }

            if (animalArr[i] instanceof IMakeJoke) {
                jokeAnimal += 1;
            }
        }

        animal.setAnimalsCanFly(flyAnimal);
        animal.setAnimalsCanWalk(walkAnimal);
        animal.setAnimalsCanSing(singAnimal);
        animal.setAnimalsCanSwim(swimAnimal);
        animal.setAnimalsCanJoke(jokeAnimal);

        animalCount = "==== Animal Counting ==== \nFlying animals: " + flyAnimal + "\n" + "Walking animals: " + walkAnimal + "\n" +
                "Singing animals: " + singAnimal + "\n" + "Swimming animals: " + swimAnimal + "\n" + "Joking animals: " + jokeAnimal;

        System.out.println(animalCount);

        return animal;

    }
}
