package org.example.lectures.lecture10;

import org.example.lectures.lecture10.tests.LoginTests;
import org.example.lectures.lecture10.tests.PaymentTests;

public class App {
    public static void main(String[] args) {
        LoginTests loginTests = new LoginTests();

        loginTests.setUp();
        loginTests.test1();
        loginTests.cleanUp();

        loginTests.setUp();
        loginTests.test2();
        loginTests.cleanUp();

        PaymentTests paymentTests = new PaymentTests();

        paymentTests.setUp();
        paymentTests.test1();
        paymentTests.cleanUp();

        paymentTests.setUp();
        paymentTests.test2();
        paymentTests.cleanUp();
    }
}
