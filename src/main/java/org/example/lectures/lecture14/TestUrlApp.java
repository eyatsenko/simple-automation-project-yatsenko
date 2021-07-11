package org.example.lectures.lecture14;

import org.example.infrastructure.config.ConfigurationManager;

import java.util.HashMap;
import java.util.Map;

public class TestUrlApp {

    public static void main(String[] args) {

        String environmentVariableParameters = ConfigurationManager.getInstance().getUrlParams();

        Map<String, String> parsedURLParameters = new HashMap<>();
        if (!environmentVariableParameters.isEmpty()) {
            for (String parameter : environmentVariableParameters.split(";")) {

                String [] splitedParameters = parameter.split("=");
                parsedURLParameters.put(splitedParameters[0], splitedParameters[1]);
            }
        }

        System.out.println(parsedURLParameters);
    }
}
