package org.example.infrastructure.wdm;

import org.example.infrastructure.ConfigurationManager;

public class DefaultWebDriverManager implements WebDriverManager {

    @Override
    public String getBrowser() {
        switch (ConfigurationManager.getInstance().getRunOn()) {
            case "cloud":
                return new CloudWebDriverFactory().create();
            case "remote":
                return new RemoteWebDriverFactory().create();
            case "local":
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
