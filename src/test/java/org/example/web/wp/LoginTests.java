package org.example.web.wp;

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

        logger.log("Click Login link");
        webDriver.findElement(By.linkText("Log in")).click();
        TimeUtils.waitFor(3);

        logger.log("Enter Login");
        webDriver.findElement(By.id("user_login")).sendKeys("admin");
        TimeUtils.waitFor(3);

        logger.log("Enter Password");
        webDriver.findElement(By.id("user_pass")).sendKeys("test");
        TimeUtils.waitFor(3);

        logger.log("Click Login Button");
        webDriver.findElement(By.id("wp-submit")).click();
        TimeUtils.waitFor(3);

        logger.log("Click Error Message");
        assertTrue (webDriver.findElement(By.id("login_error")).getText().contains("The password you entered for the username")) ;
        TimeUtils.waitFor(3);
    }
}
