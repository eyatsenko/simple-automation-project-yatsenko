package org.example.lectures.lecture12.mobile.ios;

import org.example.lectures.lecture12.mobile.OrderScreen;

public class IosOrderScreen implements OrderScreen {
    @Override
    public void checkOrder() {
        System.out.println("==> IOS check order");
    }

    @Override
    public void deleteDish(String dish) {
        System.out.println("==> IOS delete dish");
    }

    @Override
    public void fillAddressForm(String address) {
        System.out.println("==> IOS fill address");
    }

    @Override
    public void checkout() {
        System.out.println("==> IOS checkout");
    }
}
