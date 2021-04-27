package org.example.infrastructure;

public class ConfigurationManager {
    // return value of passed ENV_VAR or default value of this VAR

    public static String getEnvVarOrDefault (String envVar, String defaultValue) {
        String var = System.getenv(envVar);
        return (var == null && !var.isBlank() ) ? defaultValue : var;
    }
}
