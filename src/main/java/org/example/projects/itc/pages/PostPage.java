package org.example.projects.itc.pages;

import org.example.projects.itc.entities.Post;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostPage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public PostPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(this.webDriver, 30);
    }

    public Post getGeneralPostInfo () {
        String url = webDriver.getCurrentUrl();
        String title = webDriver.findElement(By.cssSelector(".h1.text-uppercase.entry-title")).getText();
        String author = webDriver.findElement(By.cssSelector(".author.url.fn.a-not-img")).getText();

        return new Post(url, title, author);
    }
}
