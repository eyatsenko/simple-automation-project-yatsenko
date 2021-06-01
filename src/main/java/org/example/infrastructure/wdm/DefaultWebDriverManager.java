package org.example.infrastructure.wdm;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.RunOn;

public class DefaultWebDriverManager implements WebDriverManager {

    @Override
    public String getBrowser() {

        RunOn runOn = RunOn.valueOf(ConfigurationManager.getInstance().getRunOn().toUpperCase());

        switch (runOn) {
            case CLOUD:
                return new CloudWebDriverFactory().create();
            case REMOTE:
                return new RemoteWebDriverFactory().create();
            case LOCAL:
            default:
                return new LocalWebDriverFactory().create();
        }
    }

    @Override
    public void destroyBrowser(String browser) {
        if (browser != null) {
            System.out.println("Killing webDriver: " + browser);
        }
    }
}
