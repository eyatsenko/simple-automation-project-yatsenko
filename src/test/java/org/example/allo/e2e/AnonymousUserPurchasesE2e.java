package org.example.allo.e2e;

import org.example.infrastructure.logger.StdTestLogger;
import org.example.infrastructure.utils.TimeUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class AnonymousUserPurchasesE2e extends E2ETestBase {

    @Test
    public void testPurchasesRandomItem() {
        StdTestLogger logger = new StdTestLogger();
        webDriver.manage().window().maximize();
        webDriver.get("https://allo.ua/");
        TimeUtils.waitFor(2);
        Assert.assertEquals("АЛЛО - національний маркетплейс із найширшим асортиментом", webDriver.getTitle());
        logger.log("Page title is '" + webDriver.getTitle() + "'");

        WebElement imageElement = null;

        try {
            imageElement = webDriver.findElement(By.className("v-logo__img"));
        } catch (Exception e) {
            logger.log("Зображення відсутнє на сторінці");
        }

        Assert.assertNotNull(imageElement);

        logger.log("Click category 'Laptops & Computers'");
        webDriver.findElement(By.partialLinkText("Ноутбуки")).click();
        TimeUtils.waitFor(2);

        logger.log("Click subcategory 'Laptops'");
        webDriver.findElement(By.partialLinkText("Ноутбуки")).click();
        TimeUtils.waitFor(2);

        List<WebElement> products = webDriver.findElements(By.className("product-card"));

        int productIndex = new Random().nextInt(products.size());

        logger.log("Select random item and open it");
        products.get(productIndex).findElement(By.className("product-card__title")).click();
        TimeUtils.waitFor(2);

        logger.log("Check Price");
        WebElement price = webDriver.findElement(By.xpath("(//*[@class='sum'])[4]"));
        WebElement productName = webDriver.findElement(By.className("p-view__header-title"));
        logger.log("Price is '" + price.getText() + "'");
        logger.log("ProductName is '" + productName.getText() + "'");

        assertTrue(price.isDisplayed());

        //1.Get all products on page into list -> web elements
        //2. Get random index in this list
        //3. Scroll to selected item
        //4. Click on link to open Product Page

        //1. Scroll to known item
        //2.Click on link to open Product Page
        logger.log("Click 'Buy' button");
        webDriver.findElement(By.id("product-buy-button")).click();
        TimeUtils.waitFor(2);

        WebElement modalWindow = webDriver.findElement(By.className("v-modal__cmp-body"));
        WebElement newPrice = modalWindow.findElement(By.xpath(".//div[contains(concat(\" \",normalize-space(@class),\" \"),\" price-box__cur \")]"));
        WebElement newProductName = modalWindow.findElement(By.className("title"));

        // assertion price in shopping card Equals to Product price
        logger.log("Assertion price in shopping card Equals to Product price");
        Assert.assertEquals(price.getText(), newPrice.getText());

        // assert common price is correct
        Assert.assertEquals(price.getText(), webDriver.findElement(By.className("total-box__price")).getText());

        // assert number of items is correct
        Assert.assertEquals("1", webDriver.findElement(By.xpath(".//div[contains(concat(\" \",normalize-space(@class),\" \"),\" qty \")]/label/input")).getAttribute("value"));

        // assert items titles
        Assert.assertEquals(productName.getText(), newProductName.getText());
        TimeUtils.waitFor(2);

        logger.log("Click Checkout button");
        webDriver.findElement(By.className("order-now")).click();
        TimeUtils.waitFor(2);

        logger.log("Fill personal info form");
        webDriver.findElement(By.name("telephone")).sendKeys("0992000000");
        TimeUtils.waitFor(2);
        webDriver.findElement(By.name("firstname")).sendKeys("John");
        TimeUtils.waitFor(2);

        logger.log("Select city");
        WebElement cityToggle = webDriver.findElement(By.className("a-select__toggle"));
        cityToggle.click();
        WebElement cityOptions = webDriver.findElement(By.xpath("//ul[@class='base-drop__list']"));
        List<WebElement> cityList = cityOptions.findElements(By.tagName("li"));

        for (WebElement option : cityList) {
            if (option.getText().equals("Ввести інше місто")) {
                option.click();
                break;
            }
        }
        TimeUtils.waitFor(2);

        webDriver.findElement(By.name("cityAutocomplete")).sendKeys("Дніпро");
        List<WebElement> cityList2 = webDriver.findElement(By.tagName("ul")).findElements(By.tagName("li"));
        for (WebElement option : cityList2) {
            if (option.getText().equals("Дніпро")) {
                option.click();
                break;
            }
        }
        TimeUtils.waitFor(2);
    }


    @After
    public void tearDown() {
        webDriver.quit();
    }

    @Test
    @Ignore
    public void otherTest() {

        logger.log("");
        logger.log("");
        logger.log("");
        logger.log("");
        logger.log("");
    }
}