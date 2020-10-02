package com.zoopla.pages;

import com.zoopla.commons.DriverLibrary;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverLibrary {
    public String BASE_URL = "https://www.zoopla.co.uk/";
    public Select select;

    public void launchURL(){
        driver.navigate().to(BASE_URL);

    }
}
