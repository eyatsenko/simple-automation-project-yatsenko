package org.example.infrastructure.wdm;

import org.example.infrastructure.ConfigurationManager;

public class CloudWebDriverFactory implements WebDriverFactory {

    @Override
    public String create() {
        switch (ConfigurationManager.getInstance().getTestBrowser()) {
            case "firefox":
                return "Cloud Mozilla Firefox";
            case "ie":
                return "Cloud MS InternetExplorer";
            case "chrome":
            default:
                return "Cloud Google Chrome";
        }
    }
}
