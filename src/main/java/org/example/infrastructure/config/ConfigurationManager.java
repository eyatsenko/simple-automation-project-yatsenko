package org.example.infrastructure.config;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

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

    public String getTestDataSource () {
        return getEnvVarOrDefault("TestDataSource", "file");
    }

    public String getUrlParams () {
        return getEnvVarOrDefault("urlParams", "");
    }

    public String getLocale ()  {
        return getEnvVarOrDefault("testLocale", "en");
    }

    // return value of passed ENV_VAR or default value of this VAR
    private String getEnvVarOrDefault(String envVar, String defaultValue) {
        String var = System.getenv(envVar);
        return (var == null || var.isBlank()) ? defaultValue : var;
    }

    public static void setEnv(Map<String, String> newenv) throws Exception {
        try {
            Class<?> processEnvironmentClass = Class.forName("java.lang.ProcessEnvironment");
            Field theEnvironmentField = processEnvironmentClass.getDeclaredField("theEnvironment");
            theEnvironmentField.setAccessible(true);
            Map<String, String> env = (Map<String, String>) theEnvironmentField.get(null);
            env.putAll(newenv);
            Field theCaseInsensitiveEnvironmentField = processEnvironmentClass.getDeclaredField("theCaseInsensitiveEnvironment");
            theCaseInsensitiveEnvironmentField.setAccessible(true);
            Map<String, String> cienv = (Map<String, String>)     theCaseInsensitiveEnvironmentField.get(null);
            cienv.putAll(newenv);
        } catch (NoSuchFieldException e) {
            Class[] classes = Collections.class.getDeclaredClasses();
            Map<String, String> env = System.getenv();
            for(Class cl : classes) {
                if("java.util.Collections$UnmodifiableMap".equals(cl.getName())) {
                    Field field = cl.getDeclaredField("m");
                    field.setAccessible(true);
                    Object obj = field.get(env);
                    Map<String, String> map = (Map<String, String>) obj;
                    map.clear();
                    map.putAll(newenv);
                }
            }
        }
    }
}
