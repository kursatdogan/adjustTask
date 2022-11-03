package com.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchPage extends BasePage{

    @FindBy(xpath = "//input[@title='Search Wikipedia']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@href='/wiki/Wikipedia:About']")
    public WebElement aboutBtn;



}
