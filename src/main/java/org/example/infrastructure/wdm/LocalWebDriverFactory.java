package org.example.infrastructure.wdm;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.BrowserType;

public class LocalWebDriverFactory implements WebDriverFactory {

    @Override
    public String create() {

        BrowserType type = BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

        switch (type) {
            case FIREFOX:
                return "Local Mozilla Firefox";
            case INTERNET_EXPLORER:
                return "Local MS InternetExplorer";
            case CHROME:
            default:
                return "Local Google Chrome";
        }
    }
}
