package org.example.PageObject;

import gherkin.formatter.model.Match;
import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resultpage extends DriverFactory {

    @FindBy(xpath = "//span[contains(text(),'Sports and fitness')]")
    WebElement sportsandfitnessbutton;

    public void Sportsandfitness(){
        sportsandfitnessbutton.click();


    }
    public void SportsandfitnessbuttonURL()

    {
        String actualsportsandfitnessURL = driver.getCurrentUrl();
        Assert.assertThat(actualsportsandfitnessURL, Matchers.containsString("https://www.argos.co.uk/search/nike/category:799635/"));

    }


}
