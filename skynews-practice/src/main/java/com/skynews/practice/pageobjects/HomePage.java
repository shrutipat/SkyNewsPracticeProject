package com.skynews.practice.pageobjects;

import com.skynews.practice.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Archita Patel
 */
public class HomePage extends Util {


    @FindBy (xpath="//button[text()='Accept']")
    WebElement _accept;


    public String getTitleText(){
        return driver.getTitle();
    }

    public void clickAccept() {
        clickOnElement(_accept);
    }
}
