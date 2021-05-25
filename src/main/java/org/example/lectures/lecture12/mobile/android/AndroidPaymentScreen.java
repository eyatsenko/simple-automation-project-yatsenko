package org.example.lectures.lecture12.mobile.android;

import org.example.lectures.lecture12.mobile.PaymentScreen;

public class AndroidPaymentScreen implements PaymentScreen {
    @Override
    public void fillCreditCardForm() {
        System.out.println("==> Android fill CreditCard form");
    }

    @Override
    public void pay() {
        System.out.println("==> Android pay");
    }
}
