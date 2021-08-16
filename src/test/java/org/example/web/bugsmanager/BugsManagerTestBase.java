package org.example.web.bugsmanager;

import org.example.infrastructure.base.TestBase;
import org.example.projects.bugsmanager.BugsManagerWebsite;
import org.example.projects.itc.ItcWebsite;

public class BugsManagerTestBase extends TestBase {

    protected BugsManagerWebsite bmws;

    @Override
    protected void beforeTest() {
        logger.log("Open Website");
        webDriver.get("https://bugsmanager.herokuapp.com/");
        bmws = new BugsManagerWebsite(webDriver);
    }
}
