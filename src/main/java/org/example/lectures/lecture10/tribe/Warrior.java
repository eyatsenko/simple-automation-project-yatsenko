package org.example.lectures.lecture10.tribe;

public class Warrior extends Citizen {

    private String rank;

    public Warrior(String name, String rank) {
        super(name);
        this.rank = rank;
    }

    public void fight () {
        System.out.println("Fighting");
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + getName() + '\'' + ", " +
                "rank='" + rank + '\'' +
                '}';
    }
}
