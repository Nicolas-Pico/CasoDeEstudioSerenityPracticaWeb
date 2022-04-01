package com.co.serenity.tasks;

import com.co.serenity.interactions.AddProductInteraction;
import com.co.serenity.interactions.CategoryPageInteraction;
import com.co.serenity.interactions.HomePageInteraction;
import com.co.serenity.interactions.LoginInteraction;
import com.co.serenity.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FlowTask implements Task {

    private final Map<String, String>DataLogin;

    public FlowTask(Map<String, String> dataLogin) {
        DataLogin = dataLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Called class interaction with Home page of website
        actor.attemptsTo(HomePageInteraction.homePageInteraction());

        actor.attemptsTo(LoginInteraction.loginInteraction(DataLogin));

        actor.attemptsTo(CategoryPageInteraction.categoryPageInteraction());

        actor.attemptsTo(AddProductInteraction.addProductInteraction());

    }

    public static FlowTask flowTask(Map<String, String>DataLogin) {

        return instrumented(FlowTask.class,DataLogin);
    }

}
