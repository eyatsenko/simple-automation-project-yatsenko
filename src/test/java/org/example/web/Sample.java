package org.example.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        Thread.sleep(3_000);

        driver.close();
    }
}
