package com.co.serenity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.serenity.userinterfaces.CategoryPageUserInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CategoryPageInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(BTN_MENU));
        actor.attemptsTo(Click.on(BTN_DOG));
        actor.attemptsTo(Click.on(BTN_PRODUCT));
    }

    public static CategoryPageInteraction categoryPageInteraction() {
        return instrumented(CategoryPageInteraction.class);
    }

}
