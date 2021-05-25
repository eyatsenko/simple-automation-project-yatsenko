package org.example.lectures.lecture12.others;

public class Laptop implements Computer, Movable{

    @Override
    public void compute() {
        System.out.println("Power saving computing");
    }

    @Override
    public void move() {
        System.out.println("Work in portable mode");
    }
}
