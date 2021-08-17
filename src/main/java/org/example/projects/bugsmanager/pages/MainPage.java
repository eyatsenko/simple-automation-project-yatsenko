package org.example.projects.bugsmanager.pages;

import org.example.infrastructure.utils.TimeUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage {

    private WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;

    }

    public List<WebElement> getAllBugs() {
        WebElement table = webDriver.findElement(By.id("gridview-1028"));
        List<WebElement> bugs = table.findElements(By.tagName("tr"));
        return bugs;
    }

    public void openAndFillForm(String randomBugName, String randomBugNotes) {
        webDriver.findElement(By.id("ext-gen1108")).click();
        TimeUtils.waitFor(3);
        ExpectedConditions.visibilityOf(webDriver.findElement(By.id("bugs__add_form")));
        WebElement form = webDriver.findElement(By.id("bugs__add_form"));

        form.findElement(By.name("name")).sendKeys(randomBugName);
        form.findElement(By.name("notes")).sendKeys(randomBugNotes);
        form.findElement(By.cssSelector("span[class='x-btn-inner']")).click();
    }

    public void deleteBug() {

        List<WebElement> bugs = getAllBugs();

        for (WebElement webElement : bugs) {
            String st = webElement.getText();
            if (st.contains("Yatsenko")) {
                webElement.click();
                webDriver.findElement(By.id("ext-gen1102")).click();

                WebDriverWait wait = new WebDriverWait(webDriver, 5);
                wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(By.id("messagebox-1001"))));
                WebElement confirmWindow = webDriver.findElement(By.id("messagebox-1001"));

                WebElement yesButton = confirmWindow.findElement(By.id("button-1010"));
                yesButton.click();
                break;
            }
        }
    }


    public void fillNameAndNotes(String name, String notes) {

        TimeUtils.waitFor(2);

        webDriver.findElement(By.id("ext-gen1087")).click();
        Actions actions = new Actions(webDriver);
        actions.sendKeys(Keys.chord(name)).build().perform();

        Actions actions2 = new Actions(webDriver);
        actions2.sendKeys(Keys.chord(Keys.TAB)).build().perform();

        Actions actions3 = new Actions(webDriver);
        actions3.doubleClick().perform();
        actions3.sendKeys(Keys.chord(notes)).build().perform();
        actions3.sendKeys(Keys.chord(Keys.TAB)).build().perform();

        TimeUtils.waitFor(5);

        WebElement applyButton = webDriver.findElement(By.id("button-1044"));
        applyButton.click();

        TimeUtils.waitFor(10);
    }

    public boolean isBugPresent(String bugName) {

        boolean result = false;

        TimeUtils.waitFor(3);
        List<WebElement> bugs = getAllBugs();

        for (WebElement webElement : bugs) {
            String st = webElement.getText();
            if (st.contains(bugName)) {
                result = true;
                break;
            }
        }

        return result;
    }

    public void refreshPage() {
        webDriver.findElement(By.id("tool-1053")).click();
        TimeUtils.waitFor(3);
    }
}
