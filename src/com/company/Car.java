package com.company;

public class Car implements AutoCloseable {

    public void drive() {
        System.out.println("mashina jurup jatat");

    }

    public void close() {
        System.out.println("mashina jabylyp jatat");
    }

}
