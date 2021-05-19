package org.example.lectures.lecture10.tests;

import org.example.infrastructure.TestBase;
import org.example.infrastructure.TestServer;

public class LoginTestBase extends TestBase {
    @Override
    protected void beforeTest() {
        logger.log("Open website: " + new TestServer().getURL());
        logger.log("Open Login dialog");
    }
}
