package org.example.lectures.lecture10.tests;

import org.example.infrastructure.base.TestBase;

public class LoginTestBase extends TestBase {
    @Override
    protected void beforeTest() {
        logger.log("Open website: " + browser);
        logger.log("Open Login dialog");
    }
}
