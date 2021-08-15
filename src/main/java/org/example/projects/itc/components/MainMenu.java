package org.example.projects.itc.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainMenu {

    private WebElement root;

    public MainMenu (WebElement root) {
        this.root = root;
    }

    public void clickMenuItem(String itemTitle) {
        for (WebElement i : menuItems()) {
            if (i.getText().equals(itemTitle)) {
                i.click();
                break;
            }
        }
    }

    public void openReviewMenu () {
        menuItems().get(1).click();
    }

    private List <WebElement> menuItems () {
        return root.findElements(By.tagName("li"));
    }
}
