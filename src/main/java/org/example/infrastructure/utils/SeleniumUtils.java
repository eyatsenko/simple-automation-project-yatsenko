/*
package org.example.infrastructure.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class SeleniumUtils {
    private String parentWindowHandle = "";
    private String parentWindowName = "";
    private String newWindowHandle = "";
    private String newWindowTitle = "";
    WebDriver driver = new ChromeDriver();
    Set<String> handlesOld = new HashSet<>();
    Set<String> handlesNew = new HashSet<>();
    Map<String, String> handlesAndTitles = new HashMap<>();
     
    public void switchToWindow (String title) {
        handlesOld = driver.getWindowHandles();
        parentWindowHandle = driver.getWindowHandle();
        parentWindowName = driver.getTitle();

        for (String handle : handlesOld) {

            handlesAndTitles.entrySet(handle, driver.switchTo().window(handle).getTitle());
        }

        for (String title : handlesAndTitles) {
            if (!title.equals(title)) {
                driver.switchTo().window()
            }
        }

    }

    public void goToParentWindow (String parentWindowName) {

    }


}
*/
