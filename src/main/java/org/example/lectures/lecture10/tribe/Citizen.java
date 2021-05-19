package org.example.lectures.lecture10.tribe;

public class Citizen {

    private String name;

    public Citizen(String name) {
        this.name = name;
    }

    public void work () {
        System.out.println("Working");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                '}';
    }
}
