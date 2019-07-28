package com.skynews.practice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Archita Patel
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@feature1",
        monochrome = true
)
public class CukeTest {

}
