package com.qa.ivenus.steps;

import com.qa.ivenus.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }

    @When("I should click on register icon")
    public void iShouldClickOnRegisterIcon() {
        new HomePage().clickOnRegisterIcon();
    }

    @And("I should click on register link")
    public void iShouldClickOnRegisterLink() {
    }

    @When("I should enter Username {string}")
    public void iShouldEnterUsername(String arg0) {
    }

    @And("I should enter Email address {string}")
    public void iShouldEnterEmailAddress(String arg0) {
    }

    @And("I should enter Password {string}")
    public void iShouldEnterPassword(String arg0) {
    }

    @And("I should click on Register button")
    public void iShouldClickOnRegisterButton() {
    }

    @Then("I should verify Text {string}")
    public void iShouldVerifyText(String arg0) {
    }
}
