package org.example.web;

import org.example.infrastructure.logger.StdTestLogger;
import org.example.infrastructure.utils.TimeUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class LoginTests extends WordpressTestBase {

    @Test
    public void testLoginWithIncorrectPassword() {

        StdTestLogger logger = new StdTestLogger();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://yatsenko-site123.byethost22.com/");

        TimeUtils.waitFor(1);
        logger.log("Click Login link");
        webDriver.findElement(By.linkText("Log in")).click();
        TimeUtils.waitFor(1);

        logger.log("Enter Login");
        webDriver.findElement(By.id("user_login")).sendKeys("admin");
        TimeUtils.waitFor(1);

        logger.log("Enter Password");
        webDriver.findElement(By.id("user_pass")).sendKeys("test");
        TimeUtils.waitFor(1);

        logger.log("Click Login Button");
        webDriver.findElement(By.id("wp-submit")).click();
        TimeUtils.waitFor(1);

        logger.log("Check Error Message");
        assertTrue (webDriver.findElement(By.id("login_error")).getText().contains("The password you entered for the username")) ;

        webDriver.quit();
    }

    @Test
    public void testLoginWithIncorrectLogin() {

        StdTestLogger logger = new StdTestLogger();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://yatsenko-site123.byethost22.com/");

        TimeUtils.waitFor(2);
        logger.log("Click Login link");
        webDriver.findElement(By.linkText("Log in")).click();
        TimeUtils.waitFor(2);

        logger.log("Enter Login");
        webDriver.findElement(By.id("user_login")).sendKeys("edik");
        TimeUtils.waitFor(2);

        logger.log("Enter Password");
        webDriver.findElement(By.id("user_pass")).sendKeys("test");
        TimeUtils.waitFor(2);

        logger.log("Click Login Button");
        webDriver.findElement(By.id("wp-submit")).click();
        TimeUtils.waitFor(2);

        logger.log("Check Error Message");
        assertTrue (webDriver.findElement(By.id("login_error")).getText().contains("is not registered on this site. If you are unsure of your username, try your email address instead.")) ;

        webDriver.quit();
    }

    @Test
    public void testLoginWithIncorrectLoginAndPassword() {

        StdTestLogger logger = new StdTestLogger();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://yatsenko-site123.byethost22.com/");

        TimeUtils.waitFor(2);
        logger.log("Click Login link");
        webDriver.findElement(By.linkText("Log in")).click();
        TimeUtils.waitFor(1);

        logger.log("Enter Login");
        webDriver.findElement(By.id("user_login")).sendKeys("edik");
        TimeUtils.waitFor(2);

        logger.log("Enter Password");
        webDriver.findElement(By.id("user_pass")).sendKeys("test");
        TimeUtils.waitFor(2);

        logger.log("Click Login Button");
        webDriver.findElement(By.id("wp-submit")).click();
        TimeUtils.waitFor(2);

        logger.log("Check Error Message");
        assertTrue (webDriver.findElement(By.id("login_error")).getText().contains("is not registered on this site. If you are unsure of your username, try your email address instead.")) ;

        webDriver.quit();
    }

    @Test
    public void testLoginWithEmptyLoginAndPassword() {

        StdTestLogger logger = new StdTestLogger();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://yatsenko-site123.byethost22.com/");

        TimeUtils.waitFor(2);
        logger.log("Click Login link");
        webDriver.findElement(By.linkText("Log in")).click();
        TimeUtils.waitFor(2);

        logger.log("Click Login Button");
        webDriver.findElement(By.id("wp-submit")).click();
        TimeUtils.waitFor(2);

        logger.log("Check Error Message");
        assertTrue (webDriver.findElement(By.id("login_error")).getText().contains("The username field is empty.")) ;
        assertTrue (webDriver.findElement(By.id("login_error")).getText().contains("The password field is empty.")) ;

        webDriver.quit();
    }

    @Test
    public void testLoginWithValidLoginAndPassword() {

        StdTestLogger logger = new StdTestLogger();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://yatsenko-site123.byethost22.com/");

        TimeUtils.waitFor(1);
        logger.log("Click Login link");
        webDriver.findElement(By.linkText("Log in")).click();
        TimeUtils.waitFor(1);

        logger.log("Enter Login");
        webDriver.findElement(By.id("user_login")).sendKeys("admin");
        TimeUtils.waitFor(1);

        logger.log("Enter Password");
        webDriver.findElement(By.id("user_pass")).sendKeys("indesit1995");
        TimeUtils.waitFor(1);

        logger.log("Click Login Button");
        webDriver.findElement(By.id("wp-submit")).click();
        TimeUtils.waitFor(1);

        logger.log("Check 'Log Out' button");
        assertTrue(webDriver.findElement(By.linkText("Log out")).isDisplayed());

        webDriver.quit();
    }
}
