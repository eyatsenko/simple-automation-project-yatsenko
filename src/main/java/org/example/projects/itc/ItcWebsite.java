package org.example.projects.itc;

import org.example.projects.itc.pages.ArticlesPage;
import org.example.projects.itc.pages.MainPage;
import org.example.projects.itc.pages.PostPage;
import org.openqa.selenium.WebDriver;

public class ItcWebsite {

    private WebDriver webDriver;

    public ItcWebsite(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public MainPage mainPage() {
        return new MainPage(webDriver);
    }

    public ArticlesPage articlesPage() {
        return new ArticlesPage(webDriver);
    }

    public PostPage postPage() {
        return new PostPage(webDriver);
    }

/*    public MainMenu menu() {
        //return new MainMenu();
    }*/
}