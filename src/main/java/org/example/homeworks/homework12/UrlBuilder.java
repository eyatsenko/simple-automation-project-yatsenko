package org.example.homeworks.homework12;

public class UrlBuilder {
    static class Builder {
        StringBuilder stringBuilder = new StringBuilder();

        public void withProtocol(String protocol) {
            stringBuilder.append(protocol + "://");
        }

        public void withDomain(String domain) {
            stringBuilder.append(domain);
        }

        public void withPort(String port) {
            stringBuilder.append(":" + port);
        }

        public void withPath(String path) {
            stringBuilder.append(path);
        }

        public void withParam(String param) {
            if (!stringBuilder.toString().contains("?")) {
                stringBuilder.append("?" + param);
            } else stringBuilder.append("&" + param);
        }

        public void withParam(String key, String value) {
            if (!stringBuilder.toString().contains("?")) {
                stringBuilder.append("?" + key + "=" + value);
            } else stringBuilder.append("&" + key + "=" + value);
        }

        public String build() {
            return stringBuilder.toString();
        }
    }
}
