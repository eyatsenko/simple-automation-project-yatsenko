package org.example.infrastructure.wdm.factory;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.WebDriverFactory;
import org.example.infrastructure.wdm.enums.BrowserType;

public class CloudWebDriverFactory implements WebDriverFactory {

    @Override
    public String create() {

        BrowserType type = BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

        switch (type) {
            case FIREFOX:
                return "Cloud Mozilla Firefox";
            case INTERNET_EXPLORER:
                return "Cloud MS InternetExplorer";
            case CHROME:
            default:
                return "Cloud Google Chrome";
        }
    }
}
