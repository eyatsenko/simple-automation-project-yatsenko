package org.example.web.bugsmanager;

import org.example.infrastructure.base.TestBase;
import org.example.projects.bugsmanager.BugsManagerWebsite;

public class BugsManagerTestBase extends TestBase {

    protected BugsManagerWebsite bugsManagerWebsite;

    @Override
    protected void beforeTest() {
        logger.log("Open Website");
        webDriver.get("https://bugsmanager.herokuapp.com/");
        bugsManagerWebsite = new BugsManagerWebsite(webDriver);
    }
}
