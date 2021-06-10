package org.example.infrastructure.base;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.data.DbUserDataMapper;
import org.example.infrastructure.data.FileUserDataMapper;
import org.example.infrastructure.data.UserDataMapper;
import org.example.infrastructure.logger.FileTestLogger;
import org.example.infrastructure.logger.StdTestLogger;
import org.example.infrastructure.logger.TestLogger;
import org.example.infrastructure.wdm.DefaultWebDriverManager;

public class TestBase {
    protected TestLogger logger;
    private DefaultWebDriverManager wdm;
    protected String browser;

    protected UserDataMapper userData;

    public void setUp() {
        userData = getUserData();
        logger = getLogger();
        wdm = new DefaultWebDriverManager();
        browser = wdm.getBrowser();
        System.out.println("Starting browser " + browser);
        beforeTest();
    }

    public void cleanUp() {
        afterTest();

        wdm.destroyBrowser(browser);
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

    private UserDataMapper getUserData() {
        return ConfigurationManager.getInstance().getTestDataSource().equals("file") ?
                new FileUserDataMapper("users.txt") : new DbUserDataMapper("sqlite://mytest.db");
    }
}
