package org.example.lectures.lecture12.mobile.android;

import org.example.lectures.lecture12.mobile.OrderScreen;

public class AndroidOrderScreen implements OrderScreen {
    @Override
    public void checkOrder() {
        System.out.println("==> Android check order");
    }

    @Override
    public void deleteDish(String dish) {
        System.out.println("==> Android delete dish");
    }

    @Override
    public void fillAddressForm(String address) {
        System.out.println("==> Android fill address");
    }

    @Override
    public void checkout() {
        System.out.println("==> Android checkout");
    }
}
