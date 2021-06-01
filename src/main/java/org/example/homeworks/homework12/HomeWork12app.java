package org.example.homeworks.homework12;

import org.example.infrastructure.utils.UrlBuilder;
import org.example.infrastructure.utils.UrlBuilder.Builder;

public class HomeWork12app {
    public static void main(String[] args) {

        Builder builder = new UrlBuilder.Builder();

        builder.withProtocol("https://");
        builder.withDomain("www.lms.ithillel.ua");
        builder.withPort(":443");
        builder.withPath("/groups");
        builder.withParam("var1");
        builder.withParam("var2", "69");
        builder.withParam("var3");
        builder.withParam("var4");
        builder.withParam("var5", "777");
        builder.withParam("var6", "666");

        System.out.println(builder.build());
    }
}
