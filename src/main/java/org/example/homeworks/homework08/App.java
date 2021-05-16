package org.example.homeworks.homework08;

import org.example.infrastructure.ConfigurationManager;

public class App {
    public static void main(String[] args) {
        FractionNumber number1 = new FractionNumber(5, 6);
        FractionNumber number2 = new FractionNumber(5, 6);

        System.out.println(number1.equals(number2));

        ConfigurationManager configurationManager = ConfigurationManager.getInstance();

        System.out.println(configurationManager.getTestBrowser());
        System.out.println(configurationManager.getTestEnv());
    }
}
