package org.example.infrastructure.logger;

public class StdTestLogger extends TestLogger {

    @Override
    public void log (String msg) {
        System.out.println(formatMessage(msg));
    }

    @Override
    public void end() {
        System.out.println();
    }
}
