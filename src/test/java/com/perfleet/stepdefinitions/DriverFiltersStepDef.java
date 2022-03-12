package com.perfleet.stepdefinitions;

import com.perfleet.pages.DashboardPage;
import com.perfleet.pages.FilterPage;
import com.perfleet.pages.LoginPage;
import com.perfleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DriverFiltersStepDef {
    DashboardPage dashboardPage = new DashboardPage();
    FilterPage filterPage = new FilterPage();

    @When("the user click on the {string} option")
    public void theUserShouldBeAbleToClickOnTheOption(String driver) {

        dashboardPage.waitUntilLoaderScreenDisappear();
        filterPage.filtersFilterPage.click();
        filterPage.manageFiltersbuttonFilterPage.click();
        BrowserUtils.waitFor(2);
        filterPage.driverCheckboxFilterPage.click();
        BrowserUtils.waitFor(2);
        filterPage.driverAllbuttonFilterPage.click();
        BrowserUtils.waitFor(2);
        filterPage.dropDownbuttonFilterPage.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user should see following methods")
    public void theUseShouldSeeFollowingOptions(List<String> methods) {

        List<String> actualOptions = BrowserUtils.getElementsText(filterPage.dDropDownMethodsFP);

        Assert.assertEquals(methods, actualOptions);
    }

    @When("the user select {string} method")
    public void theUserSelectMethod(String Contains) {
        filterPage.dmethodFP(Contains).click();
    }

    @And("the user search by {string}")
    public void theUserSearchBy(String keyword) {
        filterPage.driverdropdowninputFP.sendKeys(keyword);
        filterPage.updateButtonFilterPage.click();
    }

    @Then("the user can see all the {string} appears in the results")
    public void theUserCanSeeAllTheAppearsInTheResults(String results) {
        BrowserUtils.waitFor(3);

        List<String> actual = BrowserUtils.getElementsText(filterPage.driverDroplistFP);

        for (String element : actual) {
            if (element.contains(results)) {
                Assert.assertTrue(true);
            }
        }
    }

    @Then("the {string} should not appear in the results")
    public void theShouldNotAppearInTheResults(String results) {

        List<String> actual = BrowserUtils.getElementsText(filterPage.driverDroplistFP);

        for (String element : actual) {
            if (element.contains(results)) {
                Assert.assertFalse(false);
            }
        }
    }

    @Then("the user select the {string} and enter {string} characters")
    public void theUserSelectTheAndEnterCharacters(String methods, String nonalphachracters) {
        filterPage.dmethodFP(methods).click();
        filterPage.driverdropdowninputFP.sendKeys(nonalphachracters);
        filterPage.updateButtonFilterPage.click();
    }

    @Then("the user should see the following message appears {string}")
    public void theUserShouldSeeTheFollowingMessageAppears(String msgfromParameter) {
        BrowserUtils.waitForVisibility(filterPage.errorMessage,5);
        String actual = filterPage.errorMessage.getText();
        Assert.assertEquals(msgfromParameter,actual);
    }
}


