package org.example.lectures.lecture06;

import org.example.infrastructure.StringUtils;

public class StringApp {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(StringUtils.randomString("ALPHA", 15));
            System.out.println(StringUtils.randomString("NUMERIC", 15));
            System.out.println(StringUtils.randomString("ALPHANUMERIC", 15));
        }
    }
}
