package com.gof.designpattern.interpreter.basis;

import com.gof.designpattern.interpreter.People;

/**
 * Created by yl3 on 07.12.15.
 */
public class OtherPeopleB implements Interpreter{

    People people;

    public OtherPeopleB(People people) {
        this.people = people;
    }

    public void interpreter() {
        if (("Tom").equals(people.getName())) {
            System.out.println("People B said that Tom is a funny guy.");
        } else {
            System.out.println("Name is not known by system.");
        }
    }

}
