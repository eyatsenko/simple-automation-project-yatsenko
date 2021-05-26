package org.example.infrastructure.wdm;

import org.example.infrastructure.ConfigurationManager;

// 3) Метод create должен вернуть строку (пока что) браузер, который будет запущен на основе envVar
public class CloudWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {
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
}
