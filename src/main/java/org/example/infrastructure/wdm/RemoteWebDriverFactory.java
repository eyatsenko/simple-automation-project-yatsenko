package org.example.infrastructure.wdm;

import org.example.infrastructure.ConfigurationManager;

public class RemoteWebDriverFactory implements WebDriverFactory {

    @Override
    public String create() {
        switch (ConfigurationManager.getInstance().getTestBrowser()) {
            case "firefox":
                return "Remote Mozilla Firefox";
            case "ie":
                return "Remote MS InternetExplorer";
            case "chrome":
            default:
                return "Remote Google Chrome";
        }
    }
}
