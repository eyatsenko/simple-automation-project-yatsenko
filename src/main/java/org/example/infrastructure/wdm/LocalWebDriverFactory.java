package org.example.infrastructure.wdm;

import org.example.infrastructure.ConfigurationManager;

public class LocalWebDriverFactory implements WebDriverFactory {

    @Override
    public String create() {
        switch (ConfigurationManager.getInstance().getTestBrowser()) {
            case "firefox":
                return "Local Mozilla Firefox";
            case "ie":
                return "Local MS InternetExplorer";
            case "chrome":
            default:
                return "Local Google Chrome";
        }
    }
}
