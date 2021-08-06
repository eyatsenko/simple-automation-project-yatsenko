package org.example.infrastructure.utils;

public class TimeUtils {

    public static void waitFor (long seconds) {
        try {
            Thread.sleep(seconds * 1_000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
