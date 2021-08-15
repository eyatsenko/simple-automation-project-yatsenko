package org.example.projects.itc.pages;

import org.example.projects.itc.entities.Post;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class MainPage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(this.webDriver, 30);

    }

    public Post openRandomArticle() {
        int randomNumber = new Random().nextInt(5);
        WebElement postRow = getAllPosts().get(randomNumber);

        String title = postRow.findElement(By.cssSelector(".entry-title.text-uppercase")).getText();
        String url = postRow.findElement(By.cssSelector("a.a-not-img")).getAttribute("href");
        String author = postRow.findElement(By.cssSelector(".vcard.author.part.hidden-xs")).getText();

        Post post = new Post(url, title, author);

        postRow.findElement(By.cssSelector("a.a-not-img")).click();
        return post;
    }

    private List<WebElement> getAllPosts() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("content")));
        return webDriver.findElement(By.id("content")).findElements(By.cssSelector("div[class*='post']"));
    }


}
