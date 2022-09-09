package com.cydeo.solid.interfaceSegregation.example.good;

import com.cydeo.solid.interfaceSegregation.example.bad.Bird;
import com.cydeo.solid.interfaceSegregation.example.bad.Chicken;
import com.cydeo.solid.interfaceSegregation.example.bad.Eagle;
import com.cydeo.solid.interfaceSegregation.example.bad.Owl;

import java.util.ArrayList;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {

        List<CanFly> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Owl());
        birds.add(new Chicken());// Compiler says that chicken can not fly

        letBirdsFly(birds);

    }

    public static void letBirdsFly(List<CanFly> birds) {
        for(CanFly bird : birds) {
            bird.fly();    //Does
        }
    }

}
