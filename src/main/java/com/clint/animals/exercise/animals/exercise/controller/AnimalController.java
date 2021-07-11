package com.clint.animals.exercise.animals.exercise.controller;

import com.clint.animals.exercise.animals.exercise.model.*;
import com.clint.animals.exercise.animals.exercise.helper.AnimalCounter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animalsApi")
public class AnimalController {
    // For Branch Praktis !!!
    @GetMapping("/getAnimalCounts")
    public Animal getAnimalActionCount() {

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        Animal animal = AnimalCounter.countAnimal(animals);

        return animal;
    }

}
