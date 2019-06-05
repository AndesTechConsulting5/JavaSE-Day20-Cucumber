package org.andestech.learning.rfb19.g4;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
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
public class IEAppTest
{

    private WebDriver webDriver;
    private InternetExplorerOptions internetExplorerOptions;


    @BeforeClass
    public void init()
    {
        System.setProperty("webdriver.ie.driver",
                "E:\\selenium_drivers\\IEDriverServer.exe");


        internetExplorerOptions = new InternetExplorerOptions();
       // internetExplorerDriver.addArguments("--start-fullscreen");
       // internetExplorerDriver.addArguments("--start-fullscreen");

        internetExplorerOptions.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        internetExplorerOptions.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

        webDriver = new InternetExplorerDriver(internetExplorerOptions);

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
