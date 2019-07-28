package com.skynews.practice.browserselector;

import com.skynews.practice.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Archita Patel
 */
public class BrowserSelector extends BasePage {

    public void selectBrowser(String browser) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
    }
}
