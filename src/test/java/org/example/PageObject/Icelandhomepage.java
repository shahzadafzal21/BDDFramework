package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class Icelandhomepage extends DriverFactory {

    @FindBy(xpath ="//input[@id='header-search']")
    WebElement Searchbox;

    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/button[1]")

    WebElement Searchbutton;

    public void dosearch(String item){
        Searchbox.sendKeys(item);

        Searchbutton.click();
    }


}
