package com.skynews.practice.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Archita Patel
 */
public class BasePage {

    public static WebDriver driver;

    public BasePage(){
       // PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\test\\java\\resources\\propertiesfiles\\log4j.properties");
        PageFactory.initElements(driver, this);
    }
}
