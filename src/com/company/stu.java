package com.company;

public class stu extends Student {

    @Override
    public void course() {
        System.out.println("Courses up to now -> 36");
    }

    @Override
    public void average() {
        System.out.println("\n\tBest Average = 18.84");
    }

    @Override
    public void years() {
        System.out.println("\n\t\tSophomore");
    }
}
