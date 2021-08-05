package org.example.infrastructure.wdm;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.RunOn;
import org.openqa.selenium.WebDriver;

public class DefaultWebDriverManager implements WebDriverManager {

    @Override
    public WebDriver getWebDriver() {

        RunOn runOn = RunOn.valueOf(ConfigurationManager.getInstance().getRunOn().toUpperCase());

        switch (runOn) {
            case CLOUD:
                return new CloudWebDriverFactory().create();
            case REMOTE:
                return new RemoteWebDriverFactory().create();
            case LOCAL:
            default:
                return new LocalWebDriverFactory().create();
        }
    }

    @Override
    public void destroyWebDriver(WebDriver browser) {
        if (browser != null) {
            System.out.println("Killing webDriver: " + browser);
            browser.quit();
        }
    }
}
