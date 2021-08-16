package org.example.projects.bugsmanager.pages;

import org.example.infrastructure.utils.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage {

    private WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;

    }

    public List<WebElement> getAllBugs () {
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gridview-1028")));
        return webDriver.findElement(By.id("content")).findElements(By.cssSelector("tr[class*='x-grid-row']"));
    }

    public void openAndFillForm () {
        WebElement formButton = webDriver.findElement(By.id("ext-gen1108"));
        formButton.click();
        WebElement form = webDriver.findElement(By.id("bugs__add_form"));

        String randomBugName = "Yatsenko_bug" + StringUtils.randomString(StringUtils.Mode.NUMERIC, 5);
        String randomBugNotes = "Yatsenko_note" + StringUtils.randomString(StringUtils.Mode.ALPHA, 5);

        form.findElement(By.id("ext-gen1343")).sendKeys(randomBugName);
        form.findElement(By.id("ext-gen1347")).sendKeys(randomBugNotes);

        form.findElement(By.id("ext-gen1320")).click();
    }

   // public void

    public void refreshPage () {
        webDriver.findElement(By.id("tool-1053")).click();
    }
}
