package com.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchResultsPage extends BasePage {

    @FindBy(xpath = "(//i)[1]")
    public WebElement searchResult;

    @FindBy(xpath = "//a[@title='Adjustment Day']")
    public WebElement adjustResult;

    @FindBy(xpath = "//a[@href='/wiki/Wikipedia:About']")
    public WebElement about;


}
