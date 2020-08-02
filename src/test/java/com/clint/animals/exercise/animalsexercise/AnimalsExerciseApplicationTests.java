package com.clint.animals.exercise.animalsexercise;

import com.clint.animals.exercise.animalsexercise.helper.Constants;
import com.clint.animals.exercise.animalsexercise.model.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class AnimalsExerciseApplicationTests {

    @Test
    void testBirds() {

        Bird bird = new Bird();
        System.out.println("==== Testing Bird ====\n" + bird.printQuirks());
        assertThat(bird.printQuirks(), containsString("fly"));
        assertThat(bird.printQuirks(), containsString("sing"));
        assertThat(bird.printQuirks(), containsString("walk"));

        Duck duck = new Duck();
        System.out.println("\n==== Testing Duck ====\n" + duck.printQuirks());
        assertThat(duck.printQuirks(), containsString("fly"));
        assertThat(duck.printQuirks(), containsString("swim"));
        assertThat(duck.printQuirks(), containsString("walk"));
        assertThat(duck.printQuirks(), containsString("quack"));

        Chicken chicken = new Chicken();
        System.out.println("\n==== Testing chicken ====\n" + chicken.printQuirks());
        assertThat(chicken.printQuirks(), containsString("walk"));
        assertThat(chicken.printQuirks(), containsString("cluck"));

        Rooster rooster = new Rooster();
        System.out.println("\n==== Testing rooster ====\n" + rooster.printQuirks());
        assertThat(rooster.printQuirks(), containsString("walk"));
        assertThat(rooster.printQuirks(), containsString("cock"));

    }

    @Test
    void testParrot(){

        Parrot lonelyParrot = new Parrot();
        System.out.println("\n==== Testing Lonely Parrot ====\n" + lonelyParrot.printQuirks());
        assertThat(lonelyParrot.printQuirks(), containsString("walk"));
        assertThat(lonelyParrot.printQuirks(), containsString("fly"));
        assertThat(lonelyParrot.printQuirks(), containsString("sing"));
        assertThat(lonelyParrot.printQuirks(), containsString("chirp"));

        Parrot parrotWithDog = new Parrot();
        System.out.println("\n==== Testing Parrot with Dog ====\n" + parrotWithDog.printQuirks(Constants.SOMETHING_DOG));
        assertThat(parrotWithDog.printQuirks(Constants.SOMETHING_DOG), containsString("walk"));
        assertThat(parrotWithDog.printQuirks(Constants.SOMETHING_DOG), containsString("fly"));
        assertThat(parrotWithDog.printQuirks(Constants.SOMETHING_DOG), containsString("sing"));
        assertThat(parrotWithDog.printQuirks(Constants.SOMETHING_DOG), containsString("woof"));

        Parrot parrotWithCat = new Parrot();
        System.out.println("\n==== Testing Parrot with Cat ====\n" + parrotWithCat.printQuirks(Constants.SOMETHING_CAT));
        assertThat(parrotWithCat.printQuirks(Constants.SOMETHING_CAT), containsString("walk"));
        assertThat(parrotWithCat.printQuirks(Constants.SOMETHING_CAT), containsString("fly"));
        assertThat(parrotWithCat.printQuirks(Constants.SOMETHING_CAT), containsString("sing"));
        assertThat(parrotWithCat.printQuirks(Constants.SOMETHING_CAT), containsString("meow"));

        Parrot parrotWithRooster = new Parrot();
        System.out.println("\n==== Testing Parrot with Cat ====\n" + parrotWithRooster.printQuirks(Constants.SOMETHING_ROOSTER));
        assertThat(parrotWithRooster.printQuirks(Constants.SOMETHING_ROOSTER), containsString("walk"));
        assertThat(parrotWithRooster.printQuirks(Constants.SOMETHING_ROOSTER), containsString("fly"));
        assertThat(parrotWithRooster.printQuirks(Constants.SOMETHING_ROOSTER), containsString("sing"));
        assertThat(parrotWithRooster.printQuirks(Constants.SOMETHING_ROOSTER), containsString("cock"));

        Parrot parrotWithDuck = new Parrot();
        System.out.println("\n==== Testing Parrot with Duck ====\n" + parrotWithDuck.printQuirks(Constants.SOMETHING_DUCK));
        assertThat(parrotWithDuck.printQuirks(Constants.SOMETHING_DUCK), containsString("walk"));
        assertThat(parrotWithDuck.printQuirks(Constants.SOMETHING_DUCK), containsString("fly"));
        assertThat(parrotWithDuck.printQuirks(Constants.SOMETHING_DUCK), containsString("sing"));
        assertThat(parrotWithDuck.printQuirks(Constants.SOMETHING_DUCK), containsString("quack"));

        Parrot parrotWithPhone = new Parrot();
        System.out.println("\n==== Testing Parrot with Phone ====\n" + parrotWithPhone.printQuirks(Constants.SOMETHING_PHONE));
        assertThat(parrotWithPhone.printQuirks(Constants.SOMETHING_PHONE), containsString("walk"));
        assertThat(parrotWithPhone.printQuirks(Constants.SOMETHING_PHONE), containsString("fly"));
        assertThat(parrotWithPhone.printQuirks(Constants.SOMETHING_PHONE), containsString("sing"));
        assertThat(parrotWithPhone.printQuirks(Constants.SOMETHING_PHONE), containsString("ring"));

    }

    @Test
    void testFishes(){

        Fish fish = new Fish();
        System.out.println("\n==== Testing Fish ====\n" + fish.printQuirks());
        assertThat(fish.printQuirks(), containsString("swim"));
        assertThat(fish.printQuirks(), containsString("transparent"));
        assertThat(fish.printQuirks(), containsString("abstract"));

        ClownFish nemo = new ClownFish();
        System.out.println("\n==== Testing Finding Nemo ====\n" + nemo.printQuirks());
        assertThat(nemo.printQuirks(), containsString("swim"));
        assertThat(nemo.printQuirks(), containsString("orange"));
        assertThat(nemo.printQuirks(), containsString("small"));

        Shark shark = new Shark();
        System.out.println("\n==== Testing Shark ====\n" + shark.printQuirks());
        assertThat(shark.printQuirks(), containsString("swim"));
        assertThat(shark.printQuirks(), containsString("grey"));
        assertThat(shark.printQuirks(), containsString("large"));

    }

    @Test
    void testDolphins(){
        Dolphin dolphin = new Dolphin();
        System.out.println("\n==== Testing dolphin ====\n" + dolphin.printQuirks());
    }

}
