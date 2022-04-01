package com.co.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageUSerInterface {

    public static final Target TXT_EMAIL = Target.the("Box text of email").located(By.xpath("//*[@id=\"CustomerEmail\"]"));

    public  static final Target TXT_PASSWORD = Target.the("Box text of password").located(By.xpath("//*[@id=\"CustomerPassword\"]"));

    public static final Target BTN_SINGIN = Target.the("Btn sing in").located(By.xpath("//*[@id=\"customer_login\"]/p[1]/button"));
}
