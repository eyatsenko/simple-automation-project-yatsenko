package org.example.rozetka.e2e;

import org.junit.Test;

public class AnonymousUserPurchasesE2e extends E2ETestBase {

    @Test
    public void testPurchasesRandomItem () {

        logger.log("Click category 'Laptops & Computers'");
        logger.log("Click subcategory 'Laptops'");
        logger.log("Select random item and open it");
        //assertions
        //1. Title is present
        //2. Images are present
        //3. Price is present

        //1.Get all products on page into list -> web elements
        //2. Get random index in this list
        //3. Scroll to selected item
        //4. Click on link to open Product Page

        //1. Scroll to known item
        //2.Click on link to open Product Page
        logger.log("Click 'Buy'' button");
        // assertion price in shopping card Equals to Product price

        logger.log("Click Windows 10 option");
        logger.log("Select Professional version");
        // assertion common price was changed

        logger.log("Click Checkout button");
        // assert common price is correct
        // assert number of items is correct
        // assert items titles
        // assert items prices
        // assert total price
        logger.log("Fill personal info form");
        logger.log("Select city");
        logger.log("Select delivery spot address");
        logger.log("Select timeframe");
        logger.log("Select payment option");
        logger.log("Click confirm order");
        // assert success dialog
        // assert shopping card is empty
    }

    @Test
    public void otherTest (){

        logger.log("");
        logger.log("");
        logger.log("");
        logger.log("");
        logger.log("");
    }
}