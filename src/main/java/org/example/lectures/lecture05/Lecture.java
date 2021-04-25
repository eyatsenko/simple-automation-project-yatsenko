package org.example.lectures.lecture05;

import org.example.infrastructure.ConfigurationManager;

public class Lecture {
    public static void main(String[] args) {
        System.out.println(ConfigurationManager.getEnvVarOrDefault("JAVA_HOME", "sdfsdf"));
        System.out.println(ConfigurationManager.getEnvVarOrDefault("MyVar", "Java11"));

    }
}


