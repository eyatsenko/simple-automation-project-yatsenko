package org.example.lectures.lecture08;

import org.example.infrastructure.TestLogger;

public class App {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "test@wer.wer", "2215465464564");
        Student student2 = new Student("Vasya");

        System.out.println(student);
        System.out.println(student2);


        TestLogger logger = new TestLogger();
        logger.log("Start");
        for (int i = 0; i < 5; i++) {
            logger.log("Step " + i);
        }
        logger.log("End");
    }
}
