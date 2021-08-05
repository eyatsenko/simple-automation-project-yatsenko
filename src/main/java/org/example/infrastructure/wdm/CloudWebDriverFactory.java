package org.example.infrastructure.wdm;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.capabilities.BrowserCapabilities;
import org.example.infrastructure.wdm.enums.CloudProvider;
import org.example.infrastructure.wdm.enums.WebDriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class CloudWebDriverFactory implements WebDriverFactory {

    @Override
    public WebDriver create() {

        WebDriverType type = WebDriverType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

        DesiredCapabilities caps = new DesiredCapabilities();

        switch (type) {
            case FIREFOX:
                caps.setBrowserName("firefox");
                caps.setCapability(CapabilityType.BROWSER_VERSION, ConfigurationManager.getInstance().getFirefoxVersion());
                caps.merge(BrowserCapabilities.firefox());
            case INTERNET_EXPLORER:
                caps.setBrowserName("ie");
                caps.setCapability(CapabilityType.BROWSER_VERSION, 11);
                caps.merge(BrowserCapabilities.internetExplorer());
            case CHROME:
                caps.setBrowserName("chrome");
                caps.setCapability(CapabilityType.BROWSER_VERSION, ConfigurationManager.getInstance().getChromeVersion());
                caps.merge(BrowserCapabilities.chrome());
            default:
        }
        return new RemoteWebDriver(getServerUrl(), caps);
    }

    private URL getServerUrl() {

        CloudProvider cloudProvider = CloudProvider.valueOf(ConfigurationManager.getInstance().getCloudProvider().toUpperCase());

        String cloudUserName = ConfigurationManager.getInstance().getCloudUsername();
        String cloudAccessKey = ConfigurationManager.getInstance().getCloudAccessKey();

        String url = "";
        switch (cloudProvider) {
            case SAUCE_LABS:
                url = String.format("{}:{}@saucelabs.com/sdfsdff", cloudUserName, cloudAccessKey);
                break;
            case BROWSER_STACK:
                url = String.format("{}:{}@browserstack.com/sdfsdff", cloudUserName, cloudAccessKey);
                break;
            default:
                throw new IllegalArgumentException();
        }

        try {
            return new URL(url);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
