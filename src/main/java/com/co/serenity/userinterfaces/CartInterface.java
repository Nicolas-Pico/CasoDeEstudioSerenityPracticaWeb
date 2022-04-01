package com.co.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartInterface {

    public static final Target TXT_VALIDATEPRODUCT = Target.the("Validate product in the cart").located(By.xpath("//*[@id=\"CartContainer\"]/div[1]/div/div/div/div[2]/div[1]/a"));

}
