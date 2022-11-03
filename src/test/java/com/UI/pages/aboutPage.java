package com.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class aboutPage extends BasePage{

    @FindBy(xpath = "//a[@title='Category:Wikipedia basic information']")
    public WebElement basicInfoBtn;

}
