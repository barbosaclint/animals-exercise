package com.clint.animals.exercise.animalsexercise;

import com.clint.animals.exercise.animalsexercise.model.Bird;
import com.clint.animals.exercise.animalsexercise.model.Chicken;
import com.clint.animals.exercise.animalsexercise.model.Duck;
import com.clint.animals.exercise.animalsexercise.model.Rooster;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.*;


class AnimalsExerciseApplicationTests {

    @Test
    void testAnimals() {

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

}
