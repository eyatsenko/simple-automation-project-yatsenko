package org.example.infrastructure.wdm.capabilities;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCapabilities {

    public static DesiredCapabilities chrome () {
        ChromeOptions options = new ChromeOptions();
        // ...

        return new DesiredCapabilities().merge(options);
    }

    public static DesiredCapabilities firefox () {
        FirefoxOptions options = new FirefoxOptions();
        // ...

        return new DesiredCapabilities().merge(options);
    }

    public static DesiredCapabilities internetExplorer () {
        InternetExplorerOptions options = new InternetExplorerOptions();
        // ...

        return new DesiredCapabilities().merge(options);
    }

}
