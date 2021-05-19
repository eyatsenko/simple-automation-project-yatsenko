package org.example.infrastructure;

public class WebDriverManager {

    public String createWebDriver() {
        switch (ConfigurationManager.getInstance().getTestBrowser()) {
            case "firefox":
                return "Mozilla Firefox";
            case "ie":
                return "MS InternetExplorer";
            case "chrome":
            default:
                return "Google Chrome";
        }
    }

    public void destroyWebDriver (String webDriver) {
        if (webDriver != null) {
            System.out.println("Killing webDriver: " + webDriver);
        }
    }
}