package org.example.infrastructure;

import org.example.infrastructure.logger.FileTestLogger;
import org.example.infrastructure.logger.StdTestLogger;
import org.example.infrastructure.logger.TestLogger;

public class TestBase {
    protected TestLogger logger;
    private WebDriverManager wdm;
    protected String browser;

    public void setUp() {
        logger = getLogger();
        wdm = new WebDriverManager();
        browser = wdm.createWebDriver();
        System.out.println("Starting browser " + browser);
        beforeTest();
    }

    public void cleanUp() {
        afterTest();

        wdm.destroyWebDriver(browser);
        logger.end();
    }

    protected void beforeTest() {

    }

    protected void afterTest() {

    }

    private TestLogger getLogger () {
        return ConfigurationManager.getInstance().getRunOn().equals("local") ?
                new StdTestLogger(): new FileTestLogger();
    }
}
