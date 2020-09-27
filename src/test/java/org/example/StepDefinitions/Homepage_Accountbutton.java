package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_Accountbutton {

    Homepage homepage = new Homepage();


    @Given("^User is on Argos homepage$")
    public void user_is_on_Argos_homepage() throws Throwable {
        //homepage.getHomepageUrl();

    }

    @When("^User clicks on Accountbutton$")
    public void user_clicks_on_Accountbutton() throws Throwable {
       // homepage.clickbutton();


    }

    @Then("^User should be able to see the Accountbutton page$")
    public void user_should_be_able_to_see_the_Accountbutton_page() throws Throwable {
        //homepage.getResultPageURL();


    }
}
