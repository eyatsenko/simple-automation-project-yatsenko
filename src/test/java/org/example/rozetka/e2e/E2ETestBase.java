package org.example.rozetka.e2e;

import org.example.infrastructure.base.TestBase;

public abstract class E2ETestBase extends TestBase {

    @Override
    protected void beforeTest() {
        logger.log("Open Website");
    }
}
