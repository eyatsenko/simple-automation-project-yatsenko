package org.example.infrastructure.utils;

import org.example.infrastructure.config.ConfigurationManager;

import java.util.HashMap;
import java.util.Map;

public class TestUrl {

    private String protocol;
    private String domain;
    private int port;
    private String path;
    private Map<String, String> params = new HashMap<>();

    public TestUrl() {

    }

    public TestUrl(String protocol, String domain, int port, String path, Map<String, String> params) {
        this.protocol = protocol;
        this.domain = domain;
        this.port = port;
        this.path = path;
        this.params = params;
    }

    @Override
    public String toString() {
        return "TestUrl{" +
                "protocol='" + protocol + '\'' +
                ", domain='" + domain + '\'' +
                ", port='" + port + '\'' +
                ", path='" + path + '\'' +
                ", params='" + params + '\'' +
                '}';
    }

    public static class URLS {

        public static String myAccountUrl() {

            return new TestUrl.Builder()
                    .withDomain(ConfigurationManager.getInstance().getTestEnv())
                    .withPath("/account")
                    .build();
        }
    }

    public String getProtocol() {
        return protocol;
    }

    public String getDomain() {
        return domain;
    }

    public int getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public static class Builder {

        TestUrl url;

        public Builder() {
            url = new TestUrl();
        }

        public Builder withProtocol(String protocol) {
            url.protocol = protocol;
            return this;
        }

        public Builder withDomain(String domain) {
            url.domain = domain;
            return this;
        }

        public Builder withPort(int port) {
            url.port = port;
            return this;
        }

        public Builder withPath(String path) {
            url.path = path;
            return this;
        }

        public Builder withParam(String param) {

            url.params.put(param, "");
            return this;
        }

        public Builder withParam(String key, String value) {

            url.params.put(key, value);
            return this;
        }

        public Builder withParams(Map<String, String> params) {

            url.params.putAll(params);
            return this;
        }

        public String build() {

            String resultUrl = "";

            if (url.getProtocol() == null || url.getProtocol().isBlank()) {
                //Exception
                resultUrl += "https://";
            } else if (!url.getProtocol().contains("://")) {
                resultUrl += url.getProtocol() + "://";
            } else resultUrl += url.getProtocol();

            if (url.getDomain() != null && !url.getDomain().isBlank()) {
                resultUrl += url.getDomain() == null ? "" : url.getDomain();
            }

            if (url.getPort() > 1 && url.getPort() < 65536) {
                resultUrl += ":" + url.getPort();
            }

            if (url.getPath() != null && !url.getPath().isBlank()) {
                resultUrl += url.getPath().startsWith("/") ? url.getPath() : "/" + url.getPath();
            }

            if (!url.getParams().isEmpty()) {
                resultUrl += "?";

                for (Map.Entry<String, String> entry : url.getParams().entrySet()) {

                    resultUrl += entry.getValue().isEmpty() ?
                            entry.getKey() + "&" :
                            entry.getKey() + "=" + entry.getValue() + "&";
                }
            }

            return resultUrl;
        }
    }
}