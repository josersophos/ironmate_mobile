package com.sophos.app.stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.app.tasks.AddPermissionsOfTracking;
import com.sophos.app.tasks.AddPermissionsOfUbication;
import com.sophos.app.tasks.SelectMenuOption;
import com.sophos.app.tasks.login.LoginDatatable;


import net.serenitybdd.screenplay.actors.OnlineCast;

import org.junit.Before;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.E;
import cucumber.api.java.es.Entonces;
import cucumber.api.DataTable;
import cucumber.api.java.es.Y;

public class LoginSteps {
    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }


    @Dado("^(.*) desea ingresar a la aplicacion como usuario")
    public void  deseaIngresarALaAplicacion(String name) {
        theActorCalled(name).wasAbleTo(
                AddPermissionsOfTracking.inIos(),
                AddPermissionsOfUbication.inIos()
        );
    }

    @Y("^selecciono la opcion de Log In$")
    public void seleccionoLaOpcionDeLogIn() {
        theActorInTheSpotlight().attemptsTo(SelectMenuOption.selectOpt());
    }

    @E("^ingreso con la siguiente informacion$")
    public void ingresoConLaSigueienteInformacion(DataTable table) {
        theActorInTheSpotlight().attemptsTo(LoginDatatable.loginDatatable(table));
        System.out.printf("Por aqui voy");

    }

    @E("^ingreso el codigo de verificacion (.*)$")
    public void ingresoElCodigoDeVerificacion(String code) {
        theActorInTheSpotlight().attemptsTo(
              /*  ValidateIdentityScreenTittle.inIos(),
                LoginVerificationCode.loginVerificationCode(code)*/);
    }

    @E("^ingreso el passcode (.*)$")
    public void ingresoElPasscode(String passcode) {
        theActorInTheSpotlight().attemptsTo(
                /*DennyFaceIdPermissions.inIos(),
                LoginPassCode.loginPasscode(passcode),
                StartSession.startSession());*/
        );}


}