package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_Wishlistbutton {

    Homepage homepage = new Homepage();

    @When("^user clicks on Wishlistbutton$")
    public void user_clicks_on_Wishlistbutton() throws Throwable {
        homepage.Wishlistclick();
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user should be able to see Wishlistbutton page$")
    public void user_should_be_able_to_see_Wishlistbutton_page() throws Throwable {
        homepage.WishlistResultURL();
        // Write code here that turns the phrase above into concrete actions

    }
}
