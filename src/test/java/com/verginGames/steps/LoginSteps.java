package com.verginGames.steps;

import com.verginGames.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage()  {

    }

    @When("^I click on accept all cookies on pop up$")
    public void iClickOnAcceptAllCookiesThePopUp() {
        new LoginPage().acceptAllCookies();
    }

    @When("^I click on Login Link$")
    public void iClickOnLoginLink() {
        new LoginPage().clickOnLoginLink();
       }

    @Then("^I should navigate on login page successfully$")
    public void iNavigateOnLoginPage() {

    }

    @And("^I verify that user is on login page \"([^\"]*)\"$")
    public void iVerifyThatUserIsOnLoginPage(String expMassage)  {
        Assert.assertEquals("User is not on login page",expMassage,new LoginPage().getverifyText());

    }


}
