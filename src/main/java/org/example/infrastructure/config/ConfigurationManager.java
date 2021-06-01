package org.example.infrastructure.config;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String defaultBrowser = "Chrome";
    private String defaultEnv = "test";
    private final String TEST_BROWSER = "TESTBROWSER";
    private final String TEST_ENVIRONMENT = "TESTENV";

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
        return getEnvVarOrDefault(TEST_BROWSER, defaultBrowser);
    }

    // Env var testEnv / test
    public String getTestEnv() {
        return getEnvVarOrDefault(TEST_ENVIRONMENT, defaultEnv);
    }

    public String getRunOn(){
        return getEnvVarOrDefault("runOn", "local");
    }

    public String getMobilePlatform() {
        return getEnvVarOrDefault("mobilePlatform", "iOS");
    }

    // return value of passed ENV_VAR or default value of this VAR
    private String getEnvVarOrDefault(String envVar, String defaultValue) {
        String var = System.getenv(envVar);
        return (var == null || var.isBlank()) ? defaultValue : var;
    }
}
