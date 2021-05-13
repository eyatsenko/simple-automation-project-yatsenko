package org.example.infrastructure;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestLogger {

    private int counter = 0;

    public void log (String msg) {
        counter ++;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        String ts = sdf.format(new Date());
        String name = Thread.currentThread().getName();

        System.out.println(counter + ") " + ts + " [" + name + "]: " + msg);
    }
}
