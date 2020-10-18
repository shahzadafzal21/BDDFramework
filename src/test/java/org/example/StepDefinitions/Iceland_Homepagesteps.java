package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Icelandhomepage;

public class Iceland_Homepagesteps {

    Icelandhomepage icelandhomepage= new Icelandhomepage();


    @Given("^User is on Iceland homepage$")
    public void user_is_on_Iceland_homepage() throws Throwable {

    }


    @When("^User types crisps to search in the searchbox and clicks on the searchbutton$")
    public void user_types_crisps_to_search_in_the_searchbox_and_clicks_on_the_searchbutton() throws Throwable {
        icelandhomepage.dosearch("crisps");

    }

    @Then("^User should be able to see all the products related to crisps$")
    public void user_should_be_able_to_see_all_the_products_related_to_crisps() throws Throwable {

    }
}
