package org.example.BaseClassPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver,this);

    }

    //public static final String AUTOMATE_USERNAME = "shahzadafzal1";
    //public static final String AUTOMATE_ACCESS_KEY = "65aG1vEK3WoqF6CdtVBF";
    //public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public void openbrowser() throws MalformedURLException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        //DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setCapability("os", "Windows");
       // caps.setCapability("os_version", "10");
        //caps.setCapability("browser", "Firefox");
        //caps.setCapability("browser_version", "latest-beta");
        //caps.setCapability("browserstack.local", "false");
        //caps.setCapability("browserstack.selenium_version", "3.5.2");

        //driver = new RemoteWebDriver(new URL(URL), caps);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    }
    public void closebrowser() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();

    }
}
