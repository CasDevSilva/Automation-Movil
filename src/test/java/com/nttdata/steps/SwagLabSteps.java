package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SwagLabSteps {

    LoginScreen loginScreen;

    @Step("Escribir username {0}")
    public void textUsername(String username){
        loginScreen.writeUsername(username);
    }

    @Step("Escribir password {0}")
    public void textPassword(String password){
        loginScreen.writePassword(password);
    }

    @Step("SignIn Swaglab")
    public void signinSwagLab(){
        loginScreen.signin();
    }

    @Step("Validar titulo {0}")
    public void verifyTitle(String expectedTitle){
        String title =  loginScreen.verifyTextTitle();
        Assert.assertEquals(expectedTitle,title);
    }

    @Step("Validar existencia de Items")
    public void verifyItems(){
        int itemsListSize = loginScreen.getItemSize();
        Assert.assertTrue("El tamaño de la lista es: " + itemsListSize,itemsListSize > 0);
    }
}
