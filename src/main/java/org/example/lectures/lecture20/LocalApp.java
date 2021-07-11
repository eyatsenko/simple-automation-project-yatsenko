package org.example.lectures.lecture20;

import org.example.infrastructure.config.ConfigurationManager;

import java.util.ResourceBundle;

public class LocalApp {
    public static void main(String[] args) {

        ResourceBundle rbEn = ResourceBundle.getBundle(ConfigurationManager.getInstance().getLocale());
        System.out.println(rbEn.getString("hello"));

    }
}
