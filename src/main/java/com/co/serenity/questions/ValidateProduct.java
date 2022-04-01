package com.co.serenity.questions;

import com.co.serenity.userinterfaces.CartInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateProduct implements Question<String> {
    @Override
    public String answeredBy(Actor actor){
        String Validacion =Text.of(CartInterface.TXT_VALIDATEPRODUCT).viewedBy(actor).asString();
        System.out.println("/////////////////////// "+Validacion);
        return Validacion;
    }

    public static ValidateProduct is (){
        return new ValidateProduct();
    }
}
