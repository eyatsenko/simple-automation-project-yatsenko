package org.example.lectures.lecture03;

public class LectureApp {
    public static void main(String[] args) {




    }

    public double convert (String convertTo, double value){
        double result = 0;
        if (convertTo.equals("USD")){
            result = value * 0.036;
        } else if (convertTo.equals("pound")) {
            result = value * 0.026;
        } else if (convertTo.equals("RU")){
            result = value * 2.71;
        } else if (convertTo.equals("EURO")){
            result = 0.030 * value;
        }
        return result;
    }

    public void mult (int a){
        a=a*a; // или a*=a;
        a=a*a;
        System.out.println(a);
    }


    public static void change (int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
