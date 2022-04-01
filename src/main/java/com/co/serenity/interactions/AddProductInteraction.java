package com.co.serenity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.serenity.userinterfaces.AddProductInterface.BTN_ADDPRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ADDPRODUCT));
    }

    public static AddProductInteraction addProductInteraction() {
        return instrumented(AddProductInteraction.class);
    }
}
