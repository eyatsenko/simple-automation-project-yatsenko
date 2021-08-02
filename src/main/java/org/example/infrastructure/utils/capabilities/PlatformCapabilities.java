package org.example.infrastructure.utils.capabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class PlatformCapabilities {
    public static Capabilities getChromeCapabilities() {
        MutableCapabilities sauceOptionsChrome = new MutableCapabilities();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("w3c",true);
        chromeOptions.setCapability("platformName","Windows 10");
        chromeOptions.setCapability("browserVersion","92.0");
        chromeOptions.setCapability("sauce:options", sauceOptionsChrome);

        return chromeOptions;
    }

    public static Capabilities getFirefoxCapabilities() {
        MutableCapabilities sauceOptionsFirefox = new MutableCapabilities();

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("platformName", "Windows 10");
        firefoxOptions.setCapability("browserVersion", "90.0");
        firefoxOptions.setCapability("sauce:options", sauceOptionsFirefox);

        return firefoxOptions;
    }

    public static Capabilities getIECapabilities() {
        MutableCapabilities sauceOptions = new MutableCapabilities();

        InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
        internetExplorerOptions.setCapability("platformName", "Windows 10");
        internetExplorerOptions.setCapability("browserVersion", "latest");
        internetExplorerOptions.setCapability("sauce:options", sauceOptions);

        return internetExplorerOptions;
    }
}
