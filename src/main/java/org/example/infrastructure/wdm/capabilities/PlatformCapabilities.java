package org.example.infrastructure.wdm.capabilities;

import org.example.infrastructure.config.ConfigurationManager;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PlatformCapabilities {

    public static DesiredCapabilities general () {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(CapabilityType.PLATFORM_NAME, ConfigurationManager.getInstance().getPlatform());
        caps.setCapability(CapabilityType.VERSION,ConfigurationManager.getInstance().getPlatformVersion());

        return caps;
    }

    public static DesiredCapabilities ios () {
        return null;
    }

    public static DesiredCapabilities android () {
        return null;
    }
}
