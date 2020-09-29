package com.zoopla.hook;

import com.zoopla.commons.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Browsers {
    private Scenario scenario;
    @Before
    public void setUp(Scenario scenario){
        this.scenario = scenario;
        String defaultBrowser = "Chrome";
        launchBrowser(defaultBrowser);

    }
    @After
    public void tearDown(){
        if (scenario.isFailed())

        {
            try{
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot,"screenshot.png","failurePage");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
