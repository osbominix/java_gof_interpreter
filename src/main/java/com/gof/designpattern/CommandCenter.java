package com.gof.designpattern;

import com.gof.designpattern.interpreter.People;
import com.gof.designpattern.interpreter.basis.OtherPeopleA;
import com.gof.designpattern.interpreter.basis.OtherPeopleB;

/**
 * Created by yl3 on 07.12.15.
 */
public class CommandCenter {
    public static void main(String[] args) {
        People tom = new People("Tom");
        new OtherPeopleA(tom).interpreter();
        new OtherPeopleB(tom).interpreter();
    }
}
