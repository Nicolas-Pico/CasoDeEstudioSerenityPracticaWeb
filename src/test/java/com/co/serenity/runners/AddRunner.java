package com.co.serenity.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/validate_product.feature",
snippets = SnippetType.CAMELCASE,
glue = "com/co/serenity/stepsdefinitions")
public class AddRunner {
}
