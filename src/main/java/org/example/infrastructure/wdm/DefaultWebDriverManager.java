package org.example.infrastructure.wdm;

import org.example.infrastructure.ConfigurationManager;

// метод getBrowser должен вернуть браузер на основе enVar runOn (значения: local, remote, cloud)
public class DefaultWebDriverManager implements WebDriverManager {

    @Override
    public String getBrowser() {
        switch (ConfigurationManager.getInstance().getRunOn()) {
            case "cloud":
                return "cloud";
            case "remote":
                return "remote";
            case "local":
            default:
                return "local";
        }
    }

    @Override
    public void destroyBrowser(String browser) {
        if (browser != null) {
            System.out.println("Killing webDriver: " + browser);
        }
    }
}
