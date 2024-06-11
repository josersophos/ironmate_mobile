package com.sophos.app.tasks.login;


import static com.sophos.app.ui.LoginPage.*;

import com.sophos.app.models.UserLoginModel;
import com.sophos.app.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import co.com.devco.automation.mobile.actions.WaitFor;
import cucumber.api.DataTable;


public class LoginDatatable implements Task {
    List<UserLoginModel> userLoginList;

    public LoginDatatable(DataTable userLogin) {
        userLoginList = userLogin.asList(UserLoginModel.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userLoginList.get(0).getUsername()).into(LoginPage.USERNAME_TEXT_FIELD),
                Enter.theValue(userLoginList.get(0).getPassword()).into(LoginPage.PASSWORD_TEXT_FIELD),
                Click.on(BTN_LOGIN)
        );
    }
    public static LoginDatatable loginDatatable(DataTable user) {
        return Tasks.instrumented(LoginDatatable.class, user);
    }
}