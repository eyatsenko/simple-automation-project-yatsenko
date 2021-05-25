package org.example.lectures.lecture12.mobile.ios;

import org.example.lectures.lecture12.mobile.PaymentScreen;

public class IosPaymentScreen implements PaymentScreen {
    @Override
    public void fillCreditCardForm() {
        System.out.println("==> IOS fill CreditCard form");
    }

    @Override
    public void pay() {
        System.out.println("==> IOS pay");
    }
}
