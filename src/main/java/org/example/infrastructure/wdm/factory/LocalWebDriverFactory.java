package org.example.infrastructure.wdm.factory;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.utils.capabilities.BrowserCapabilities;
import org.example.infrastructure.wdm.WebDriverFactory;
import org.example.infrastructure.wdm.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocalWebDriverFactory implements WebDriverFactory {

    @Override
    public WebDriver create() {

        BrowserType type = BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

        switch (type) {
            case FIREFOX:
                return new FirefoxDriver(BrowserCapabilities.getFirefoxCapabilities());
            case INTERNET_EXPLORER:
                return new InternetExplorerDriver(BrowserCapabilities.getIECapabilities());
            case CHROME:
            default:
                return new ChromeDriver(BrowserCapabilities.getChromeCapabilities());
        }
    }
}
