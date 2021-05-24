package org.example.infrastructure.logger;

import java.io.File;
import java.io.FileWriter;

public class FileTestLogger extends TestLogger {

    @Override
    public void log(String msg) {
        try {
            FileWriter fw = new FileWriter(new File("1.txt"), true);
            fw.write(formatMessage(msg) + "\n");

            fw.flush();
            fw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void end() {
        try {
            FileWriter fw = new FileWriter(new File("1.txt"), true);
            fw.write("\n");

            fw.flush();
            fw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
