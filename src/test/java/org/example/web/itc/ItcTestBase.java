package org.example.web.itc;

import org.example.infrastructure.base.TestBase;
import org.example.projects.itc.ItcWebsite;

public class ItcTestBase extends TestBase {

    protected ItcWebsite itc;

    @Override
    protected void beforeTest() {
        logger.log("Open Website");
        webDriver.get("http://itc.ua/");
        itc = new ItcWebsite(webDriver);
    }
}
