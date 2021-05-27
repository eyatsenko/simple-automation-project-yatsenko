package org.example.infrastructure.wdm;

public interface WebDriverManager {

    String getBrowser();

    void destroyBrowser(String browser);
}
