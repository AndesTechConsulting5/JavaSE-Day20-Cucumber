package org.andestech.learning.rfb19.g4;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
@Test
@Ignore
public class FirefoxAppTest
{

    private WebDriver webDriver;
    private FirefoxOptions firefoxOptions;


    @BeforeClass
    public void init()
    {
        System.setProperty("webdriver.gecko.driver",
                "E:\\selenium_drivers\\geckodriver.exe");


        firefoxOptions = new FirefoxOptions();
       // firefoxOptions.addArguments("--start-fullscreen");
       // firefoxOptions.addArguments("--start-fullscreen");



        FirefoxProfile prof = new FirefoxProfile();


        DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setCapability(FirefoxDriver.);


        webDriver = new FirefoxDriver(firefoxOptions);
        webDriver.manage().window().maximize();


        System.out.println("+++ Driver: " + webDriver);
    }


    @Test
    public void site01Test() throws InterruptedException
    {
        webDriver.get("http://google.ru");
        assertTrue( true );
       // Thread.sleep(3000);

    }


    @AfterClass
    public void tearDown(){
        if(webDriver != null)
        {   webDriver.quit();
            //webDriver.close();
            System.out.println("--- Driver");
        }

    }

}
