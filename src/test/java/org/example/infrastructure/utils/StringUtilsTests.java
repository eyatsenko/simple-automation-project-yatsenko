package org.example.infrastructure.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.example.infrastructure.utils.StringUtils.Mode.*;

public class StringUtilsTests {

    private String expectedString;
    private String[] actualStringParts;
    private String actualString;

    @Before
    public void setUp() {
        actualString = "";
    }

    @Test
    public void testAlpha() {

        expectedString = StringUtils.randomString(ALPHA, 5);
        actualStringParts = expectedString.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        for (String s : actualStringParts) {
            actualString += s;
        }

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testNumeric () {

        expectedString = StringUtils.randomString(NUMERIC, 5);
        actualStringParts = expectedString.replaceAll("[^0-9]", "").split("\\s+");

        for (String s : actualStringParts) {
            actualString += s;
        }

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testAlphaNumeric () {

        expectedString = StringUtils.randomString(ALPHANUMERIC, 5);
        actualStringParts = expectedString.replaceAll("[^a-zA-Z0-9]", "").split("\\s+");

        for (String s : actualStringParts) {
            actualString += s;
        }

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testHex () {

        expectedString = StringUtils.randomString(HEX, 5);
        actualStringParts = expectedString.replaceAll("[^A-F0-9]", "").split("\\s+");

        for (String s : actualStringParts) {
            actualString += s;
        }

        Assert.assertEquals(expectedString, actualString);
    }

    @Test (expected = NullPointerException.class)
    public void testNullMode () {

        StringUtils.randomString(null, 5);

    }
}
