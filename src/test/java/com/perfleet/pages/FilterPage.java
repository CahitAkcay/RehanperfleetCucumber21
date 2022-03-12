package com.perfleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilterPage<Webelement> extends BasePage {

    //rehan
    @FindBy(css = "a[title=\"Filters\"]")
    public WebElement FilterIcon;

    @FindBy(css = "a[class='add-filter-button']")
    public WebElement ManagefiltersFilterPage;

    @FindBy(xpath = "//a[@class = 'action btn mode-icon-only']")
    public WebElement filtersFilterPage;
    //a[class='add-filter-button']

    @FindBy(css = "a.add-filter-button")
    public WebElement manageFiltersbuttonFilterPage;

    @FindBy(xpath = "//label//span[contains(text(),'Driver')]")
    public WebElement driverCheckboxFilterPage;


    @FindBy(xpath = "//*[.='All']")
    public WebElement driverAllbuttonFilterPage;

    @FindBy(xpath = "//*[.='All']")
    public WebElement driverAllbutton1;

    @FindBy(xpath = "(//button[@class=\"btn dropdown-toggle\"])")
    public WebElement TagsDropDownBtn;

    @FindBy(xpath = "//*[@class ='btn-group btn-block']/button")
    public WebElement getDropDownbuttonFilterPage;

    @FindBy(css = "input[name='value']")
    public WebElement driverdropdowninput;

    @FindBy(xpath = "//*[@class ='btn-group btn-block']/button")
    public WebElement dropDownbuttonFilterPage;

    @FindBy(css = "input[name='value']")
    public WebElement driverdropdowninputFP;

    @FindBy(xpath = "//*[.='Update']")
    public WebElement updateButtonFilterPage;

    @FindBy (xpath = "(//div/span)[4]")
    public WebElement errorMessage;


    @FindBy(css = "a[class='dropdown-item choice-value']")
    public List<WebElement>dDropDownMethodsFP;

    @FindBy(xpath = "//label/span")
    public List<WebElement> mngFiltersDropDownFP;

    @FindBy(css = "td[class='string-cell grid-cell grid-body-cell grid-body-cell-Driver']")
    public List<WebElement> driverDroplistFP;




    public WebElement dmethodFP(String method) {
        WebElement drivermethod = null;

        for (int i = 0; i <= dDropDownMethodsFP.size(); i++) {
            if (dDropDownMethodsFP.get(i).getText().contains(method)) {
                drivermethod = dDropDownMethodsFP.get(i);
                break;
            }
        }
        return drivermethod;

    }

    public WebElement dropdownFP(String list) {
        WebElement drop = null;

        for (int i = 0; i <= mngFiltersDropDownFP.size(); i++) {
            if (mngFiltersDropDownFP.get(i).getText().contains(list)) {
                drop = mngFiltersDropDownFP.get(i);
                break;
            }
        }
        return drop;

    }

}