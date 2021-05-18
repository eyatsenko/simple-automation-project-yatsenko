package org.example.lectures.lecture10.tests;

import org.example.infrastructure.TestBase;

public class PaymentsTestBase extends TestBase {
    @Override
    protected void beforeTest() {
        logger.log("Login");
        logger.log("Open My account");
        logger.log("Open Wallet");
    }
}
