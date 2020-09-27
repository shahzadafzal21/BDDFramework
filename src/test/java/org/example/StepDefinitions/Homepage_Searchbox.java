package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_Searchbox {

    Homepage homepage = new Homepage();

    @Given("^User is on the homepage of the Argos website$")
    public void user_is_on_the_homepage_of_the_Argos_website() throws Throwable {
        homepage.getHomepageUrl();

    }

    @When("^User types any product to search in the searchbox and clicks on the searchbutton$")
    public void user_types_any_product_to_search_in_the_searchbox_and_clicks_on_the_searchbutton() throws Throwable {
        homepage.dosearch("nike");
    }

    @Then("^User should be able to see all the products related to search$")
    public void user_should_be_able_to_see_all_the_products_related_to_search() throws Throwable {
        homepage.getResultPageURL();

    }

}
