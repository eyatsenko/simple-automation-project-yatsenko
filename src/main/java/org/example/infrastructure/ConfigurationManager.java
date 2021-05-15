package org.example.infrastructure;

public class ConfigurationManager {

    // implement singleton pattern

    // Env var testBrowser / chrome
    public String getTestBrowser (){
        return "";
    }

    // Env var testEnv / test
    public String getTestEnv() {
        return "";
    }

    // return value of passed ENV_VAR or default value of this VAR
    public static String getEnvVarOrDefault (String envVar, String defaultValue) {
        String var = System.getenv(envVar);
        return (var == null && !var.isBlank() ) ? defaultValue : var;
    }
}
