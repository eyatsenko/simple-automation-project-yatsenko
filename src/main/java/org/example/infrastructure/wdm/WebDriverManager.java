package org.example.infrastructure.wdm;

import org.openqa.selenium.WebDriver;

public interface WebDriverManager {

    WebDriver getWebDriver();

    void destroyWebDriver(WebDriver browser);
}
