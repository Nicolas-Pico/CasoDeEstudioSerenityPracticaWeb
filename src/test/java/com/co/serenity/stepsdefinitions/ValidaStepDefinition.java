package com.co.serenity.stepsdefinitions;

import com.co.serenity.questions.ValidateProduct;
import com.co.serenity.tasks.FlowTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidaStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUP(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^He user logs in$")
    public void heUserLogsIn() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://petstore.com/"));
    }

    @When("^The user add a new product to list$")
    public void theUserAddANewProductToList(Map<String, String> DataLogin) {
        theActorInTheSpotlight().attemptsTo(FlowTask.flowTask(DataLogin));
    }

    @Then("^the could see a product in the list$")
    public void theCouldSeeAProductInTheList() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateProduct.is(),
                Matchers.is(Matchers.equalTo("Sturdy Basic Nylon Dog Collar with Quick Snap Buckle"))));
    }
}
