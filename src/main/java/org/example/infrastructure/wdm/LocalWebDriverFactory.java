package org.example.infrastructure.wdm;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.capabilities.BrowserCapabilities;
import org.example.infrastructure.wdm.enums.WebDriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocalWebDriverFactory implements WebDriverFactory {

    @Override
    public WebDriver create() {

        WebDriverType type = WebDriverType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

        switch (type) {
            case FIREFOX:
                return new FirefoxDriver(BrowserCapabilities.firefox());
            case INTERNET_EXPLORER:
                return new InternetExplorerDriver(BrowserCapabilities.internetExplorer());
            case CHROME:
            default:
                return new ChromeDriver(BrowserCapabilities.chrome());
        }
    }
}
