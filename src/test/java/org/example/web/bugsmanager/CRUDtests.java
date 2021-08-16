package org.example.web.bugsmanager;


import org.example.infrastructure.logger.StdTestLogger;
import org.example.infrastructure.utils.StringUtils;
import org.example.infrastructure.utils.TimeUtils;
import org.example.infrastructure.wdm.DefaultWebDriverManager;
import org.example.infrastructure.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CRUDtests extends BugsManagerTestBase {

    @Test
    public void createBugUsingAddInForm () throws InterruptedException {
        StdTestLogger logger = new StdTestLogger();
        WebDriverManager wdm = new DefaultWebDriverManager();
        webDriver = wdm.getWebDriver();
        logger.log("Open form and fill it");
        webDriver.get("https://bugsmanager.herokuapp.com/");

        webDriver.findElement(By.id("ext-gen1108")).click();

        TimeUtils.waitFor(3);
        ExpectedConditions.visibilityOf(webDriver.findElement(By.id("bugs__add_form")));

        String randomBugName = "Yatsenko_bug" + StringUtils.randomString(StringUtils.Mode.NUMERIC, 5);
        String randomBugNotes = "Yatsenko_note" + StringUtils.randomString(StringUtils.Mode.ALPHA, 5);

        webDriver.findElement(By.name("name")).sendKeys(randomBugName);
        webDriver.findElement(By.name("notes")).sendKeys(randomBugNotes);

        webDriver.findElement(By.id("button-1144")).click();
        Thread.sleep(50000);


        logger.log("Check that bug is created");

        webDriver.quit();

    }

    @Test
    public void createBugUsingAdd () {

    }
}
