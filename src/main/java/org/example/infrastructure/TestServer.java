package org.example.infrastructure;

public class TestServer {
    private final String PROD = "prod";
    private final String TEST = "test";
    private final String STAGE = "stage";
    private final String DEV = "dev";


    public String getURL() {
        switch (ConfigurationManager.getInstance().getTestEnv()) {
            case PROD:
                return "https://www.prod.com";
            case TEST:
                return "https://www.test.xyz";
            case STAGE:
                return "https://www.stage.xyz";
            case DEV:
                return "https://www.dev.xyz";
            default:
                return "https://www.testdef.xyz";
        }
    }
}
