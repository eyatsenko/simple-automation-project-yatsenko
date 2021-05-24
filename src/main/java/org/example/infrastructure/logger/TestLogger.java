package org.example.infrastructure.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class TestLogger {
    public abstract void log (String msg);

    private int counter = 0;

    protected String formatMessage (String message) {
        counter ++;

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        String ts = sdf.format(new Date());

        String name = Thread.currentThread().getName();

        return counter + ") " + ts + " [" + name + "]: " + message;
    }

    public abstract void end ();
}
