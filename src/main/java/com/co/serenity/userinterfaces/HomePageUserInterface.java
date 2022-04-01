package com.co.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUserInterface {

    public static final Target BTN_ClOSE = Target.the("Button close ad").located(By.xpath("//*[@id=\"NewsletterPopup-newsletter-popup\"]/div/div/button"));

    public static final Target LINK_LOGIN = Target.the("Link login").located(By.xpath("//*[@id=\"shopify-section-header\"]/div[3]/div[2]/div/div/header/div[1]/div/div[3]/div/div/a[1]"));


}
