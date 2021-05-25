package org.example.lectures.lecture12;

import org.example.infrastructure.ConfigurationManager;
import org.example.infrastructure.logger.StdTestLogger;
import org.example.infrastructure.logger.TestLogger;
import org.example.lectures.lecture12.mobile.MobileApplication;
import org.example.lectures.lecture12.mobile.android.AndroidApplication;
import org.example.lectures.lecture12.mobile.ios.IosApplication;

public class App {

    public static void main(String[] args) {

        TestLogger logger = new StdTestLogger();

        logger.log("Start app");
        MobileApplication app = getApp();

        logger.log("Select dish");
        app.mainScreen().selectDish("pizza");
        app.mainScreen().selectDish("sushi");
        app.mainScreen().selectDish("shawarma");
        app.mainScreen().selectDish("borjomi");

        logger.log("Click Cart button");
        app.mainScreen().openCart();

        logger.log("Check order");
        app.orderScreen().checkOrder();

        logger.log("Fill address form");
        app.orderScreen().fillAddressForm("");

        logger.log("Click checkout button");
        app.orderScreen().checkout();

        logger.log("Fill CreditCard form");
        app.paymentScreen().fillCreditCardForm();

        logger.log("Click Pay button");
        app.paymentScreen().pay();

        logger.log("Check Success message");
        app.successScreen().checkMessage();

        logger.log("Click Home button");
        app.successScreen().goHome();
    }

    public static MobileApplication getApp () {
        return ConfigurationManager.getInstance().getMobilePlatform().equals("iOS") ?
                new IosApplication() : new AndroidApplication();
    }
}
