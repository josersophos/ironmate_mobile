package com.sophos.app.tasks;

import static com.sophos.app.ui.GeneralObjectsPage.*;
import static com.sophos.app.enums.Variables.PLATFORM_NAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.app.utilities.Properties;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

public class AddPermissionsOfTracking implements Task {

    public static AddPermissionsOfTracking inIos() {
        return instrumented(AddPermissionsOfTracking.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Boolean.FALSE.equals(Properties.getPlatformName().equalsIgnoreCase(PLATFORM_NAME.value()))
                && Boolean.TRUE.equals(Visibility.of(ALLOW_TRACKING_PERMISSIONS_IOS).viewedBy(actor).asBoolean())) {
            actor.attemptsTo(
                    Click.on(ALLOW_TRACKING_PERMISSIONS_IOS)
            );
        }
    }
}