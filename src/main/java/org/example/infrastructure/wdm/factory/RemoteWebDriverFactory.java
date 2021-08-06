package org.example.infrastructure.wdm.factory;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.utils.capabilities.PlatformCapabilities;
import org.example.infrastructure.wdm.WebDriverFactory;
import org.example.infrastructure.wdm.enums.WebDriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebDriverFactory implements WebDriverFactory {

    @Override
    public WebDriver create() {

        WebDriverType type = WebDriverType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

        switch (type) {
            case FIREFOX:
                return new RemoteWebDriver(PlatformCapabilities.getFirefoxCapabilities());
            case INTERNET_EXPLORER:
                return new RemoteWebDriver(PlatformCapabilities.getIECapabilities());
            case CHROME:
            default:
                return new RemoteWebDriver(PlatformCapabilities.getChromeCapabilities()) ;
        }
    }
}
