package com.skynews.practice.utility;

import com.skynews.practice.basepage.BasePage;
import org.openqa.selenium.WebElement;


public class Util extends BasePage {

    //click on element
    public void clickOnElement(WebElement element) {
        element.click();
    }

}
