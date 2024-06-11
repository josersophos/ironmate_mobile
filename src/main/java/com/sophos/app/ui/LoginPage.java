package com.sophos.app.ui;

import static co.com.devco.automation.mobile.locator.ElementFinder.dynamicElement;
import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

import net.serenitybdd.screenplay.targets.Target;

import co.com.devco.automation.mobile.locator.Locator;

public final class LoginPage {

    private static final Locator USERNAME_TEXT_FIELD_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.EditText[@content-desc=\"Username input field\"]")
            .withIosXpathStatic("//XCUIElementTypeTextField[@name=\"Username input field\"]\n");
    private static final Locator PASSWORD_TEXT_FIELD_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.EditText[@content-desc=\"Password input field\"]")
            .withIosXpathStatic("//XCUIElementTypeSecureTextField[@name=\"Password input field\"]\n");
    private static final Locator BTN_LOGIN_LOCATOR = locator()
            .withAndroidXpathStatic("//android.view.ViewGroup[@content-desc=\"Login button\"]")
            .withIosXpathStatic("//XCUIElementTypeOther[@name=\"Login button\"]");

    public static final Target USERNAME_TEXT_FIELD = Target.the("useername text field").located(theElementBy(USERNAME_TEXT_FIELD_LOCATOR));
    public static final Target PASSWORD_TEXT_FIELD = Target.the("password text field").located(theElementBy(PASSWORD_TEXT_FIELD_LOCATOR));
    public static final Target BTN_LOGIN = Target.the("boton inicio").located(theElementBy(BTN_LOGIN_LOCATOR));

    private LoginPage() {
    }
}