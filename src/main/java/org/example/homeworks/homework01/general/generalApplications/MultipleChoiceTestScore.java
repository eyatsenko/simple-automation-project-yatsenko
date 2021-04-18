package org.example.homeworks.homework01.general.generalApplications;

public class MultipleChoiceTestScore {
    public static void main(String[] args) {
        double numberOfCorrect = 5.0;
        double numberOfWrong = 3.0;
        double finalScore = numberOfCorrect - (1. / 4) * numberOfWrong;

        System.out.println("Final score is: " + finalScore);
    }
}
