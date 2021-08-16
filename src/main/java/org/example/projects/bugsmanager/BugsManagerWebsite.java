package org.example.projects.bugsmanager;

import org.example.projects.bugsmanager.pages.MainPage;
import org.openqa.selenium.WebDriver;

public class BugsManagerWebsite {

    private WebDriver webDriver;

    public BugsManagerWebsite(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public MainPage mainPage() {
        return new MainPage(webDriver);
    }
}
