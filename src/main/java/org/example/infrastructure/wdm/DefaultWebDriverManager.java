package org.example.infrastructure.wdm;

public class DefaultWebDriverManager implements WebDriverManager{

    @Override
    public String getBrowser() {
        return null;
    }

    @Override
    public void destroyBrowser(String browser) {

    }
}
