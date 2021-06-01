package org.example.infrastructure.utils;

import java.util.ArrayList;
import java.util.List;

public class UrlBuilder {
    public static String url = "";
    public static String protocolU = "";
    public static String domainU = "";
    public static String portU = "";
    public static String pathU = "";

    public static List<String> params = new ArrayList<>();

    public static String getUrl() {
        return url;
    }

    public static String getProtocolU() {
        return protocolU;
    }

    public static String getDomainU() {
        return domainU;
    }

    public static String getPortU() {
        return portU;
    }

    public static String getPathU() {
        return pathU;
    }

    public static List<String> getParams() {
        return params;
    }


    public static class Builder {

        public void withProtocol(String protocol) {
            if (protocol.contains("://")) {
                protocolU = protocol;
            } else protocolU = protocol + "://";
        }

        public void withDomain(String domain) {
            domainU = domain;
        }

        public void withPort(String port) {
            if (port.contains(":")) {
                portU = port;
            } else portU = ":" + port;
        }

        public void withPath(String path) {
            pathU = path;
        }

        public void withParam(String param) {

            if (!build().contains("?")) {
                params.add("?" + param);
            } else params.add("&" + param);
        }

        public void withParam(String key, String value) {
            if (!build().contains("?")) {
                params.add("?" + key + "=" + value);
            } else params.add("&" + key + "=" + value);
        }

        public String build() {
            url = protocolU + domainU + portU + pathU;

            for (String st : params) {
                url += st;
            }
            return url;
        }
    }
}
