package com.sophos.app.ui;

import static co.com.devco.automation.mobile.locator.ElementFinder.dynamicElement;
import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

import co.com.devco.automation.mobile.locator.Locator;

public class GeneralObjectsPage {

    public static final Target ALLOW_TRACKING_PERMISSIONS_IOS = Target.the("button allow tracking permissions").located(By.xpath("(//XCUIElementTypeOther[@name=\"Barra de desplazamiento horizontal, 1 página\"])[2]"));
    public static final Target ALLOW_LOCATION_PERMISSIONS_IOS = Target.the("button allow location permissions").located(By.id("Permitir al usar la app"));
    private static final Locator MENU_LIST_OPT_LOCATOR = locator()
            .withAndroidXpathStatic("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView")
            .withIosXpathStatic("//XCUIElementTypeButton[@name=\"tab bar option menu\"]");

    private static final Locator SELECT_MENU_OPT_LOGIN_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.TextView[contains(@class,'android.widget.TextView') and contains(@text, 'Log In')]")
            .withIosXpathStatic("//XCUIElementTypeOther[@name=\"menu item log in\"]");

//    private static final Locator SELECT_MENU_OPT_LOCATOR = locator()
//            .withAndroidXpathStatic("//android.widget.TextView[contains(@class,'android.widget.TextView') and contains(@text, '{0}')]")
//            .withIosXpathStatic("");

   public static final Target MENU_LIST_OPT = Target.the("select new user").located(theElementBy(MENU_LIST_OPT_LOCATOR));
   public static final Target SELECT_MENU_OPT_LOGIN = Target.the("select Menu Log In").located(theElementBy(SELECT_MENU_OPT_LOGIN_LOCATOR));
//   public static final Target SELECT_MENU_OPT = Target.the("select menu opt").locatedBy(dynamicElement(SELECT_MENU_OPT_LOCATOR));




    private GeneralObjectsPage() {
    }
}