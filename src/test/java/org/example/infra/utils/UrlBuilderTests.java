package org.example.infra.utils;

import org.example.infrastructure.utils.TestUrl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class UrlBuilderTests {

    private TestUrl.Builder builder;
    private String expectedRow;
    private String actualRow;
    private String protocol;
    private String domain;
    private String path;
    private int port;
    private String param;
    private Map<String, String> params = new HashMap<>();

    @Before
    public void setUp() {
        builder = new TestUrl.Builder();
        expectedRow = "";
        protocol = "https://";
        domain = "rozetka.com.ua";
        port = 443;
        path = "/account";
        param = "test";
        params.put("exp1", "1");
        params.put("exp2", "2");

    }

    @Test
    public void testWithProtocol() {

        expectedRow = protocol;
        actualRow = builder
                .withProtocol(protocol)
                .build();
        assertEquals(expectedRow, actualRow);
    }

    @Test
    public void testWithDomain() {

        expectedRow = protocol + domain;
        actualRow = builder
                .withDomain(domain)
                .build();
        assertEquals(expectedRow, actualRow);
    }

    @Test
    public void testWithDomainAndPath() {

        expectedRow = protocol + domain + path;
        actualRow = builder
                .withDomain(domain)
                .withPath(path)
                .build();
        assertEquals(expectedRow, actualRow);
    }

    @Test
    public void testWithDomainPortAndPath() {

        expectedRow = protocol + domain + ":" + port + path;
        actualRow = builder
                .withDomain(domain)
                .withPort(port)
                .withPath(path)
                .build();
        assertEquals(expectedRow, actualRow);
    }

    @Test
    public void testWithDomainPortPathAndParams() {

        expectedRow = protocol + domain + ":" + port + path + "?exp2=2&exp1=1&";
        actualRow = builder
                .withDomain(domain)
                .withPort(port)
                .withPath(path)
                .withParams(params)
                .build();
        assertEquals(expectedRow, actualRow);
    }

    @Test
    public void testEmptyProtocol () {
        expectedRow = protocol;
        actualRow = builder
                .withProtocol("")
                .build();
        assertEquals(expectedRow, actualRow);
    }

    @Test
    public void testNullProtocol () {
        expectedRow = protocol;
        actualRow = builder
                .withProtocol(null)
                .build();
        assertEquals(expectedRow, actualRow);
    }

    @Test
    public void testWithOneParam () {
        expectedRow = protocol + "?" + param + "&";
        actualRow = builder
                .withParam(param)
                .build();
        assertEquals(expectedRow, actualRow);
    }
}
