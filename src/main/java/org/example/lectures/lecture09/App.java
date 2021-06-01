package org.example.lectures.lecture09;

public class App {

    public static void main(String[] args) {

        Author stephenKing = new Author("Stephen", "King");
        stephenKing.setAlive(true);

        Author antonChehov = new Author("Anton", "Chehov");

        System.out.println(stephenKing);
        System.out.println(antonChehov);
    }
}
