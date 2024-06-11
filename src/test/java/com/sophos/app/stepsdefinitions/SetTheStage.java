package com.sophos.app.stepsdefinitions;

import com.sophos.app.utilities.Properties;

import cucumber.api.java.Before;


import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;

public class SetTheStage {
/*
    // Pipelines y granjas de dispositivos
    @Managed(driver = "Appium")
    public static WebDriver thePhone;
    private static boolean beforeAll = true;
    public static EnvironmentVariables environmentVariables;

    @Before(order = 1)
    public void setUp() {
        if (beforeAll) {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    thePhone.quit();
                    thePhone = null;
                }
            });
            beforeAll = false;
        }
        Properties.serenity(environmentVariables);
    }

    @Before(order = 2)
    public void prepareStage() {
        OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(getProxiedDriver())));
    }

    @After
    public void logOut() {
        try {
            WebDriver facade = getProxiedDriver();
            ((AppiumDriver) facade).closeApp();
            ((AppiumDriver) facade).launchApp();

        } catch (Exception ex) {
            Logger.getAnonymousLogger().log(Level.WARNING, "Could not close driver. AppiumDriver not found", ex);
        }
    }*/


    //Solo local
    @Managed(driver = "Appium")
    public static EnvironmentVariables environmentVariables;

    @Before
    public void prepareStage() {
        Properties.serenity(environmentVariables);
        OnStage.setTheStage(new OnlineCast());
    }

    /*@After
    public void logOut() {
        LogOut.logOut();
    }*/
}