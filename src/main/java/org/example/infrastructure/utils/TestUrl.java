package org.example.infrastructure.utils;

import org.example.infrastructure.config.ConfigurationManager;

public class TestUrl {

    private String protocol;
    private String domain;
    private int port;
    private String path;
    private String params = "?";

    public TestUrl() {

    }

    public TestUrl(String protocol, String domain, int port, String path, String params) {
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

        public static String myAccountUrl () {

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

    public String getParams() {
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

        public Builder withParams(String param) {

            if (param != null || !param.isBlank())
                url.params += param + "&";

            return this;
        }

        public Builder withParams(String key, String value) {

            if (key != null || !key.isBlank() || value != null || value.isBlank())
                url.params += key + "=" + value + "&";

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

            resultUrl += url.getParams();

            return resultUrl;
        }
    }
}
