package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Resultpage;

public class Resultpage_sportsandfitness {

    Resultpage resultpage = new Resultpage();

    @Given("^user is on nike result page$")
    public void user_is_on_nike_result_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user clicks on sports and fitness category$")
    public void user_clicks_on_sports_and_fitness_category() throws Throwable {
        resultpage.Sportsandfitness();
    }

    @Then("^user should be able to see sport and fitness page$")
    public void user_should_be_able_to_see_sport_and_fitness_page() throws Throwable {
        resultpage.SportsandfitnessbuttonURL();

    }
}
