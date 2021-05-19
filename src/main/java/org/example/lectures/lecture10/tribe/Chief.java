package org.example.lectures.lecture10.tribe;

public class Chief extends Warrior {

    private String respect;

    public Chief(String name, String rank, String respect) {
        super(name, rank);
        this.respect = respect;
    }

    public void massiveFeast () {
        System.out.println("Oktoberfest");
    }

    @Override
    public void work ()  {
        System.out.println("Command");
    }

    @Override
    public String toString() {
        return "Chief{" +
                "respect='" + respect + '\'' +
                '}';
    }
}
