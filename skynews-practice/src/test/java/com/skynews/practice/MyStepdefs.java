package com.skynews.practice;

import com.skynews.practice.pageobjects.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Archita Patel
 */
public class MyStepdefs {

    static String title;
    @Given("^User is on Homepage$")
    public void userIsOnHomepage() {
    }

    @And("^User handles Alert window$")
    public void userHandlesAlertWindow() {
        new HomePage().clickAccept();
    }

    @When("^User Get the browser Title$")
    public static void userGetTheBrowserTitle() {
        title = new HomePage().getTitleText();
    }

    @Then("^Verify that browser title is as expected$")
    public void verifyThatBrowserTitleIsAsExpected() {
        Assert.assertEquals(title, "The Latest News from the UK and Around the World | Sky News");
    }
}
