package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Filterpage extends DriverFactory {

    @FindBy(xpath = "//body/main[@id='app']/div[@class='app app--search-lister']/div[@id='findability']/div/div[@class='search']/div[@class='styles__SearchContent-sc-1h5mbdb-2 CfHZq xs-row xs-auto--negative lg-auto--none']/div[@class='styles__Container-sc-1h5mbdb-0 gCgRbH xs-12--none lg-9--none xs-stack']/div[@class='styles__ProductList-sc-1rzb1sn-0 kChnTV']/div[1]/div[2]/button[1]/span[1]/span[1]")
    WebElement addtotrolleybutton;

    public void Addtotrolley() {
        addtotrolleybutton.click();

    }
        @FindBy(xpath = "//a[@class='Buttonstyles__Button-q93iwm-2 dUQXJf']")
        WebElement gototrolley;
        public void Gototrolley() {
            gototrolley.click();

        }

        public void basketURL(){
            String actualbasketURL = driver.getCurrentUrl();
            Assert.assertThat(actualbasketURL, Matchers.containsString("https://www.argos.co.uk/basket"));
        }

    }//Class ends
