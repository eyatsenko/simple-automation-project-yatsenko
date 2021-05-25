package org.example.lectures.lecture12.mobile.ios;

import org.example.lectures.lecture12.mobile.MainScreen;

public class IosMainScreen implements MainScreen {
    @Override
    public void selectDish(String dishName) {
        System.out.println("==> IOS order dish: " + dishName);
    }

    @Override
    public void openCart() {
        System.out.println("==> IOS open Cart");
    }
}
