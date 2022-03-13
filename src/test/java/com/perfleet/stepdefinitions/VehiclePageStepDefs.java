package com.perfleet.stepdefinitions;

import com.perfleet.pages.DashboardPage;
import com.perfleet.pages.FilterPage;
import com.perfleet.pages.VehiclePage;
import com.perfleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VehiclePageStepDefs {

    VehiclePage vehiclePage = new VehiclePage();
    DashboardPage dashboardPage = new DashboardPage();
    FilterPage filterPage = new FilterPage();


    @Then("the page subtitle should be {string}")
    public void thePageSubtitleShouldBe(String expected) {
        BrowserUtils.waitFor(3);
        String actual = dashboardPage.getPageSubTitle();
        Assert.assertEquals(expected, actual);
    }

    @Given("the user is on the all cars page")
    public void theUserIsOnTheAllCarsPage() {
        dashboardPage.navigateToModule("Fleet", "Vehicles");
    }

    @When("the user clicks the {string}")
    public void theUserClicksThe(String filterIcon) {
        BrowserUtils.waitFor(7);
        vehiclePage.filteron.click();
    }

    @Then("the {string} button should be displayed")
    public void theButtonShouldBeDisplayed(String manageFilter) {
        BrowserUtils.waitFor(3);
        vehiclePage.manageFilters.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue("Manage Filters is displayed", vehiclePage.manageFilters.isDisplayed());
    }

    @And("the user click on {string} Button")
    public void theUserClickOnButton(String manageFilters) {
        vehiclePage.manageFilters.click();
    }

    @Then("the user can apply {string} filter by clicking")
    public void theUserCanApplyFilterByClicking(String driver) {
        vehiclePage.driverFilterVP.click();
    }

    @And("the user can apply filters by typing {string} and it should be desplayed")
    public void theUserCanApplyFiltersByTyping(String Driver) {
        vehiclePage.searchBoxVP.sendKeys(Driver);
        BrowserUtils.waitFor(2);
        Assert.assertTrue("Driver filter is displayed", vehiclePage.driverFilterVP.isDisplayed());
    }

    @Then("the user should be able to select multiple filters at the same time")
    public void theUserShouldBeAbleToSelectMultipleFiltersAtTheSameTime() {
        BrowserUtils.waitFor(2);
        vehiclePage.multipleFilters();
        BrowserUtils.waitFor(2);
      //  Assert.assertTrue("Multiple buttons are selected", vehiclePage.tagsButtonVP.isSelected());
    }

    @And("the user can remove all the filter by clicking on reset icon")
    public void theUserCanRemoveAllTheFilterByClickingOnResetIcon() {
        BrowserUtils.waitFor(2);
        vehiclePage.resetButton.click();
        BrowserUtils.waitFor(2);
        vehiclePage.manageFilters.click();
        BrowserUtils.waitFor(5);
       // Assert.assertFalse("Driver filter is selected", vehiclePage.driverFilterVP.isSelected());
    }
}
