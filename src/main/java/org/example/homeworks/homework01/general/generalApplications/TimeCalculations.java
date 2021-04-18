package org.example.homeworks.homework01.general.generalApplications;

public class TimeCalculations {
    public static void main(String[] args) {
        double age = 25.0;
        double ageInSeconds = yearsToSeconds(age);
        double ageInMinutes = secondsToMinutes(ageInSeconds);
        double ageInHours = secondsToHours(ageInSeconds);
        double ageInDays = secondsToDays(ageInSeconds);
        double ageInWeeks = secondsToWeeks(ageInSeconds);

        System.out.println("I've been alive: " + secondsToSeconds(ageInSeconds)  + " seconds, " + ageInMinutes + " minutes, "
                + ageInHours + " hours, " + ageInDays + " days, "  + ageInWeeks + " weeks, " + age + " years.");

    }

    public static double secondsToWeeks(double seconds) {
        return seconds / 604800.0;
    }


    public static double secondsToDays(double seconds) {
        return seconds / 86400.0;
    }

    public static double secondsToHours(double seconds) {
        return seconds / 3600.0;
    }

    public static double secondsToMinutes(double seconds) {
        return seconds / 60.0;
    }

    public static double secondsToSeconds(double seconds) {
        return seconds;
    }

    public static double yearsToSeconds(double years) {
        return 31536000.0 * years;
    }



}