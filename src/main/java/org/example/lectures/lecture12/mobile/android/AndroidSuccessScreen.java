package org.example.lectures.lecture12.mobile.android;

import org.example.lectures.lecture12.mobile.SuccessScreen;

public class AndroidSuccessScreen implements SuccessScreen {
    @Override
    public void goHome() {
        System.out.println("==> Android go Home");
    }

    @Override
    public void checkMessage() {
        System.out.println("==> Android check Message");
    }
}
