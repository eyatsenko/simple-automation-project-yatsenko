package org.example.web.wp;
import org.example.infrastructure.base.TestBase;

public abstract class WordpressTestBase extends TestBase {

    @Override
    protected void beforeTest() {
        logger.log("Open website");
        webDriver.get("http://yatsenko-site123.byethost22.com/");
    }
}
