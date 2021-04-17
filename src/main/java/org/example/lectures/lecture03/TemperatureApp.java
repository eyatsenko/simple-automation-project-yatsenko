package org.example.lectures.lecture03;

public class TemperatureApp {
    public static void main(String[] args) {
        double v1 = 200.0;
        double t1 = 12.0;
        double v2 = 150.5;
        double t2 = 15.3;

        double resultV = v1 + v2;
        double resultT = (v1 * t1 + v2 * t2) / resultV;
        System.out.println("Result V: " + resultV);
        System.out.println("Result T: " + resultT);
    }
}
