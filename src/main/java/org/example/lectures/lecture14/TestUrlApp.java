package org.example.lectures.lecture14;

import org.example.infrastructure.utils.TestUrl;

public class TestUrlApp {

    public static void main(String[] args) {
        System.out.println(TestUrl.URLS.myAccountUrl());
    }

    public static String myAccountUrl (String domain) {

        return new TestUrl.Builder()
                .withDomain(domain)
                .withPath("/account")
                .build();
    }
}
