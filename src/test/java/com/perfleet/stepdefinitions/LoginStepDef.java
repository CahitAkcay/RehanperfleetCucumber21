package com.perfleet.stepdefinitions;

import com.perfleet.pages.DashboardPage;
import com.perfleet.pages.LoginPage;
import com.perfleet.utilities.ConfigurationReader;
import com.perfleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the user is logged in as {string}")
    public void the_user_is_logged_in_as(String user) {

        String username = null;
        String password = null;

        if(user.contains("driver")){
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        } else if (user.contains("sales")){
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        } else if (user.contains("store")){
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }

        loginPage.login(username,password);
    }

    @When("the user navigate to {string} and {string}")
    public void go_to_from_to_module(String tab, String module) {
        DashboardPage dashboardPage = new DashboardPage();

        dashboardPage.waitUntilLoaderScreenDisappear();

        try {
            WebElement closeBtn = Driver.get().findElement(By.cssSelector("button[title='close']"));
            closeBtn.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

        dashboardPage.navigateToModule(tab, module);
    }
}