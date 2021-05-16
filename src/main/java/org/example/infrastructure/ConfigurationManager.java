package org.example.infrastructure;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String defaultBrowser = "Chrome";
    private String defaultEnv = "https://www.test.com/";

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Env var testBrowser / chrome
    public String getTestBrowser() {
        return getEnvVarOrDefault("TESTBROWSER", defaultBrowser);
    }

    // Env var testEnv / test
    public String getTestEnv() {
        return getEnvVarOrDefault("TESTENV", defaultEnv);
    }

    // return value of passed ENV_VAR or default value of this VAR
    private static String getEnvVarOrDefault (String envVar, String defaultValue) {
        return System.getenv(envVar) == null ? defaultValue : System.getenv(envVar);
    }
}
