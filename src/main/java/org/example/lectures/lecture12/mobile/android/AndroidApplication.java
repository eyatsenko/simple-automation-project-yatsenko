package org.example.lectures.lecture12.mobile.android;

import org.example.lectures.lecture12.mobile.*;

public class AndroidApplication implements MobileApplication {
    @Override
    public MainScreen mainScreen() {
        return new AndroidMainScreen();
    }

    @Override
    public OrderScreen orderScreen() {
        return new AndroidOrderScreen();
    }

    @Override
    public PaymentScreen paymentScreen() {
        return new AndroidPaymentScreen();
    }

    @Override
    public SuccessScreen successScreen() {
        return new AndroidSuccessScreen();
    }
}
