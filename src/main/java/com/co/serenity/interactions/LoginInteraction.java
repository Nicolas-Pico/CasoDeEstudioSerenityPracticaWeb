package com.co.serenity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.co.serenity.userinterfaces.LoginPageUSerInterface.*;

public class LoginInteraction implements Interaction {

    private final Map<String, String>DataLogin;

    public LoginInteraction(Map<String, String> dataLogin) {
        DataLogin = dataLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(DataLogin.get("email")).into(TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(DataLogin.get("password")).into((TXT_PASSWORD)));
        actor.attemptsTo(Click.on(BTN_SINGIN));
    }

    public static LoginInteraction loginInteraction(Map<String, String>DataLogin) {
        return instrumented(LoginInteraction.class, DataLogin);
    }
}
