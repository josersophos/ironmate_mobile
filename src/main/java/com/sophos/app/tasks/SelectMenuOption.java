package com.sophos.app.tasks;

import com.sophos.app.tasks.login.LoginDatatable;
import com.sophos.app.ui.GeneralObjectsPage;
import com.sophos.app.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import cucumber.api.DataTable;


public class SelectMenuOption implements Task {

    public static SelectMenuOption selectOpt() {
        return Tasks.instrumented(SelectMenuOption.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GeneralObjectsPage.MENU_LIST_OPT),
                Click.on(GeneralObjectsPage.SELECT_MENU_OPT_LOGIN)
        );
    }
}