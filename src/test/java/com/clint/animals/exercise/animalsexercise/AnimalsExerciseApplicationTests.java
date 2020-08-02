package com.clint.animals.exercise.animalsexercise;

import com.clint.animals.exercise.animalsexercise.model.Bird;
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

    }

}
