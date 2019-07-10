package com.example.demo.logger;

public class SampleAdder {

    public int add(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Make sure all the arguments are greater than zero.");
        }
        return a + b;
    }

}