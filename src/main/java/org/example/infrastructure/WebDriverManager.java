package org.example.infrastructure;

/*
Реализовать модуль wdm:

1) Написать интерфейс WebDriverFactory, в котором есть метод String create()
2) Написать 3 реализации этого интерфейса:

LocalWebDriverFactory
RemoteWebDriverFactory
CloudWebDriverFactory

3) Метод create должен вернуть строку (пока что) браузер, который будет запущен на основе envVar
4) Написать интерфейс WebDriverManager с двумя методами: getBrowser() и destroyBrowser(String browser)
5) Написать класс DefaultWebDriverManager, который реализует WebDriverManager
6) метод getBrowser должен вернуть браузер на основе enVar runOn (значения: local, remote, cloud)
7) Заменить старый WebDriverManager на новый
*/
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

    public void destroyWebDriver(String webDriver) {
        if (webDriver != null) {
            System.out.println("Killing webDriver: " + webDriver);
        }
    }
}