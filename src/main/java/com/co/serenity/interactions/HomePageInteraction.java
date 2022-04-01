package com.co.serenity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.serenity.userinterfaces.HomePageUserInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomePageInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ClOSE));
        actor.attemptsTo(Click.on(LINK_LOGIN));

    }

    public static HomePageInteraction homePageInteraction() {
        return instrumented(HomePageInteraction.class);
    }
}
