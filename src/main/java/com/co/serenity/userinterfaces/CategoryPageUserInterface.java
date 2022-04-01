package com.co.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoryPageUserInterface {
    public static final Target BTN_MENU = Target.the("Btn menu").located(By.xpath("//*[@id=\"shopify-section-header\"]/div[3]/div[2]/div/div/header/div[1]/div/div[1]/div"));

    public static final Target BTN_DOG = Target.the("Btn dog").located(By.xpath("//*[@id=\"Label-collections-dog1\"]"));

    public static final Target BTN_PRODUCT = Target.the("Btn product").located(By.xpath("//*[@id=\"CollectionSection\"]/div[2]/div[3]/div/a/div[1]"));

}