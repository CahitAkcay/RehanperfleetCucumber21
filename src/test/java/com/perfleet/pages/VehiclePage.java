package com.perfleet.pages;

import com.perfleet.utilities.BrowserUtils;
import com.perfleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclePage extends BasePage {

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement AllCars;

    @FindBy(css = "a[title='Filters']")
    public WebElement filteron;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filter;

    @FindBy(css ="a[class='add-filter-button']")
    public WebElement manageFilters;

    @FindBy(id = "ui-multiselect-0-0-option-0")
    public WebElement licencePlate;

    @FindBy(xpath ="//div[@class='filter-item oro-drop']")
    public List<WebElement> filter_container;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement filterName;

    @FindBy(id="ui-multiselect-0-0-option-1")
    public WebElement tags;



    public  void selectFilterBox(){
        List<WebElement> options = Driver.get().findElements(By.xpath("//input[@name='multiselect_0']"));
        for (int i = 0; i <options.size(); i++) {
            String filters = "ui-multiselect-0-0-option-"+i+"";
            Driver.get().findElement(By.id(filters)).click();
            BrowserUtils.waitFor(1);
        }
    }
}
