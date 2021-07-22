package org.example.infra.config;

import org.example.infrastructure.config.ConfigurationManager;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.example.infrastructure.config.ConfigurationManager.setEnv;
import static org.junit.Assert.assertEquals;

public class ConfigurationManagerTests {

    private ConfigurationManager configurationManager;
    private Map<String, String> emptyValues;
    private Map<String, String> customValues;
    private String customTestBrowser = "Firefox";
    private String customTestEnv = "prod";
    private String customRunOn = "remote";
    private String customMobilePlatform = "Android";
    private String customTestDataSource = "file";
    private String customUrlParams = "2";

    private String defTestBrowser = "Chrome";
    private String defTestEnv = "test";
    private String defRunOn = "local";
    private String defMobilePlatform = "iOS";
    private String defTestDataSource = "file";
    private String defUrlParams = "";


    @Before
    public void setUp() {
        configurationManager = ConfigurationManager.getInstance();

        emptyValues = new HashMap<>();

        emptyValues.put("TESTBROWSER", "");
        emptyValues.put("TESTENV", "");
        emptyValues.put("runOn", "");
        emptyValues.put("mobilePlatform", "");
        emptyValues.put("TestDataSource", "");
        emptyValues.put("urlParams", "");
        emptyValues.put("testLocale", "");

        customValues = new HashMap<>();

        customValues.put("TESTBROWSER", "Firefox");
        customValues.put("TESTENV", "prod");
        customValues.put("runOn", "remote");
        customValues.put("mobilePlatform", "Android");
        customValues.put("TestDataSource", "file");
        customValues.put("urlParams", "2");
        customValues.put("testLocale", "ua");
    }


    @Test
    public void testGetDefTestBrowser() throws Exception {
        setEnv(emptyValues);
        assertEquals(defTestBrowser, configurationManager.getTestBrowser());
    }


    @Test
    public void testGetDefTestEnv() throws Exception {
        setEnv(emptyValues);
        assertEquals(defTestEnv, configurationManager.getTestEnv());
    }

    @Test
    public void testGetDefRunOn() throws Exception {
        setEnv(emptyValues);
        assertEquals(defRunOn, configurationManager.getRunOn());
    }

    @Test
    public void testGetDefMobilePlatform() throws Exception {
        setEnv(emptyValues);
        assertEquals(defMobilePlatform, configurationManager.getMobilePlatform());
    }

    @Test
    public void testGetDefTestDataSource() throws Exception {
        setEnv(emptyValues);
        assertEquals(defTestDataSource, configurationManager.getTestDataSource());
    }

    @Test
    public void testGetDefUrlParams() throws Exception {
        setEnv(emptyValues);
        assertEquals(defUrlParams, configurationManager.getUrlParams());
    }


    @Test
    public void testGetCustomTestBrowser() throws Exception {
        setEnv(customValues);
        assertEquals(customTestBrowser, configurationManager.getTestBrowser());
    }

    @Test
    public void testGetCustomTestEnv() throws Exception {
        setEnv(customValues);
        assertEquals(customTestEnv, configurationManager.getTestEnv());
    }

    @Test
    public void testGetCustomRunOn() throws Exception {
        setEnv(customValues);
        assertEquals(customRunOn, configurationManager.getRunOn());
    }

    @Test
    public void testGetCustomMobilePlatform() throws Exception {
        setEnv(customValues);
        assertEquals(customMobilePlatform, configurationManager.getMobilePlatform());
    }

    @Test
    public void testGetCustomTestDataSource() throws Exception {
        setEnv(customValues);
        assertEquals(customTestDataSource, configurationManager.getTestDataSource());
    }

    @Test
    public void testGetCustomUrlParams() throws Exception {
        setEnv(customValues);
        assertEquals(customUrlParams, configurationManager.getUrlParams());
    }
}
