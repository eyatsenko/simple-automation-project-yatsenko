package org.example.infrastructure.utils.capabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCapabilities {
    public static Capabilities getChromeCapabilities() {
        DesiredCapabilities sauceOptionsChrome = new DesiredCapabilities();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("platformName","Windows 10");
        chromeOptions.setCapability("browserVersion","92.0");

        return chromeOptions.merge(sauceOptionsChrome);
    }

    public static Capabilities getFirefoxCapabilities() {
        DesiredCapabilities sauceOptionsFirefox = new DesiredCapabilities();

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("platformName", "Windows 10");
        firefoxOptions.setCapability("browserVersion", "90.0");

        return firefoxOptions.merge(sauceOptionsFirefox);
    }

    public static Capabilities getIECapabilities() {
        DesiredCapabilities sauceOptionsIE = new DesiredCapabilities();

        InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
        internetExplorerOptions.setCapability("platformName", "Windows 10");
        internetExplorerOptions.setCapability("browserVersion", "latest");

        return internetExplorerOptions.merge(sauceOptionsIE);
    }
}
