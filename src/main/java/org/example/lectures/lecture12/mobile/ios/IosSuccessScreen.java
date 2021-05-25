package org.example.lectures.lecture12.mobile.ios;

import org.example.lectures.lecture12.mobile.SuccessScreen;

public class IosSuccessScreen implements SuccessScreen {
    @Override
    public void goHome() {
        System.out.println("==> IOS go Home");
    }

    @Override
    public void checkMessage() {
        System.out.println("==> IOS check Message");
    }
}
