package org.example.infrastructure;

public class TestBase {
    protected TestLogger logger;
    private WebDriverManager wdm;
    protected String browser;

    public void setUp() {
        logger = new TestLogger();
        wdm = new WebDriverManager();
        browser = wdm.createWebDriver();
        System.out.println("Starting browser " + browser);
        beforeTest();
    }

    public void cleanUp() {
        afterTest();
        wdm.destroyWebDriver(browser);
    }

    protected void beforeTest() {

    }

    protected void afterTest() {

    }
}
