package com.itproger.studying.oop;

public class Person {

    static int count;

    public Person() {
        count++;
    }

    public static void getCount() {
        System.out.println("Count is " + count);
    }

}
