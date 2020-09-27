package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Filterpage;

public class Filterpage_addtotrolley {

    Filterpage filterpage = new Filterpage();

    @When("^user clicks on add to trolley button of Nike Leon Armband$")
    public void user_clicks_on_add_to_trolley_button_of_Nike_Leon_Armband() throws Throwable {
        filterpage.Addtotrolley();

    }

    @When("^user clicks on go to trolley button$")
    public void user_clicks_on_go_to_trolley_button() throws Throwable {
        filterpage.Gototrolley();

    }

    @Then("^user should be able to see product in the basket$")
    public void user_should_be_able_to_see_product_in_the_basket() throws Throwable {
        filterpage.basketURL();

    }
}
