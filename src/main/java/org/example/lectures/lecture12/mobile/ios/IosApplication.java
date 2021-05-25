package org.example.lectures.lecture12.mobile.ios;

import org.example.lectures.lecture12.mobile.*;

public class IosApplication implements MobileApplication {
    @Override
    public MainScreen mainScreen() {
        return new IosMainScreen();
    }

    @Override
    public OrderScreen orderScreen() {
        return new IosOrderScreen();
    }

    @Override
    public PaymentScreen paymentScreen() {
        return new IosPaymentScreen();
    }

    @Override
    public SuccessScreen successScreen() {
        return new IosSuccessScreen();
    }
}
