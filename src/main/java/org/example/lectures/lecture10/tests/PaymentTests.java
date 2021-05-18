package org.example.lectures.lecture10.tests;

public class PaymentTests extends PaymentsTestBase {

    public void test1 (){
        logger.log("Fill in Payment Agreement");
        logger.log("Select checkbox 'Confirm'");

        logger.log("Verification");
    }

    public void test2 (){
        logger.log("Decline Payment Agreement");
        logger.log("Back to main page");
        logger.log("Verification");
    }
}
