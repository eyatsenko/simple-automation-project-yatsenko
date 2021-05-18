package org.example.lectures.lecture10.tribe;


public class Shaman extends Citizen {

    private String level;

    public Shaman(String name, String level) {
        super(name);
        this.level = level;
    }

    public void ritualMassacre() {
        System.out.println("Opening hearts");
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "name='" + getName() + '\'' + ", " +
                "level='" + level + '\'' +
                '}';
    }

    @Override
    public void work (){
        System.out.println("Meditate");
    }
}
