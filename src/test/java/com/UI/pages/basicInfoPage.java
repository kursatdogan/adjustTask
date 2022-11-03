package com.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class basicInfoPage extends BasePage{

    @FindBy(xpath = "//span[@class='mw-page-title-main']")
    public WebElement category;

}
