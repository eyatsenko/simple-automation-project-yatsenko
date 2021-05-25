package org.example.lectures.lecture12.mobile.android;

import org.example.lectures.lecture12.mobile.MainScreen;

public class AndroidMainScreen implements MainScreen {
    @Override
    public void selectDish(String dishName) {
        System.out.println("==> Android order dish: " + dishName);
    }

    @Override
    public void openCart() {
        System.out.println("==> Android open Cart");
    }
}
