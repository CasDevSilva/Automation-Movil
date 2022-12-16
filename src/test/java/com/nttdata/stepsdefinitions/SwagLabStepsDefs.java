package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SwagLabStepsDefs {

    @Steps
    SwagLabSteps swagLabSteps;

    @When("inicio sesión con el usuario {string} y password {string}")
    public void signinSwagWithUsernameAndPassword(String username, String password) {
        swagLabSteps.textUsername(username);
        swagLabSteps.textPassword(password);
        swagLabSteps.signinSwagLab();
    }
    @Then("valido que debería aparecer el título {string}")
    public void validoTitulo(String text) {
        swagLabSteps.verifyTitle(text);
    }
    @And("valido existencia de items")
    public void validoQueAlMenosExistaUnItem() {
        swagLabSteps.verifyItems();
    }
}
