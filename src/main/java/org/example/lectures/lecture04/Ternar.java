package org.example.lectures.lecture04;

import static java.lang.Math.*;

public class Ternar {
    public static void main(String[] args) {
        double weight = 70;
        double height = 1.1;

        double bmi = weight/pow(height,2);

        String result = (bmi <= 18.5) ? "Underweight" : (bmi <= 25.0) ? "Normal" : (bmi <= 30.0) ? "Overweight" : (bmi > 30.0) ? "Obese" : "";
        System.out.println(bmi);
        System.out.println(result);

        System.out.println();

        System.out.println(describeAge(25));

    }

    public static String
    describeAge (Integer age) {
        String ageS = age <= 12 ? "You're a kid" : (age >12 && age <=17) ?
                "You're a(n) teenager" : (age > 17 && age <= 64) ?
                "You're a(n) adult" : (age >= 65) ?
                "You're a(n) elderly" : "";
        return ageS;
    }
}
