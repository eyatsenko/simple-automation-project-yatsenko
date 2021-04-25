package org.example.infrastructure;

public class ConfigurationManager {
    // return value of passed ENV_VAR or default value of this VAR

    public static String getEnvVarOrDefault (String envVar, String defaultValue) {
        return System.getenv(envVar) == null ? defaultValue : System.getenv(envVar);
    }
}
