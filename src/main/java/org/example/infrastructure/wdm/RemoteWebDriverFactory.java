package org.example.infrastructure.wdm;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.BrowserType;

public class RemoteWebDriverFactory implements WebDriverFactory {

    @Override
    public String create() {

        BrowserType type = BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

        switch (type) {
            case FIREFOX:
                return "Remote Mozilla Firefox";
            case INTERNET_EXPLORER:
                return "Remote MS InternetExplorer";
            case CHROME:
            default:
                return "Remote Google Chrome";
        }
    }
}
