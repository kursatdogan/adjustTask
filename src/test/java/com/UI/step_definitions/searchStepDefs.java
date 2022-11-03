package com.UI.step_definitions;

import com.UI.pages.*;
import com.UI.utilities.BrowserUtils;
import com.UI.utilities.ConfigurationReader;
import com.UI.utilities.Driver;
import com.github.javafaker.Faker;
//import com.weavr.UI.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

import java.util.Locale;


public class searchStepDefs {

    searchPage searchPage = new searchPage();
    searchResultsPage searchResultsPage = new searchResultsPage();
    aboutPage aboutPage = new aboutPage();
    basicInfoPage basicInfoPage = new basicInfoPage();

    @Given("the user navigate to the search page")
    public void the_user_navigate_to_the_search_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("the user enter any word to search box")
    public void the_user_enter_any_word_to_search_box() {

        searchPage.searchBox.sendKeys("adjust");

    }
    @When("the user click to search button")
    public void the_user_click_to_search_button() {

        searchPage.searchButton.click();

    }

    @When("the user click to adjust result")
    public void the_user_click_to_adjust_result() {
        searchResultsPage.adjustResult.click();
    }

    @Then("the user should able to see correct results")
    public void the_user_should_able_to_see_correct_results() {

       Assert.assertEquals(searchResultsPage.searchResult.getText(),"Adjustment Day");

    }

    @When("the user click to about button")
    public void the_user_click_to_about_button() {
        searchPage.aboutBtn.click();
    }


    @When("the user click to basic information button")
    public void the_user_click_to_basic_information_button() {

        aboutPage.basicInfoBtn.click();

    }
    @Then("the user should able to navigate related page")
    public void the_user_should_able_to_navigate_related_page() {

        Assert.assertEquals(basicInfoPage.category.getText(),"Wikipedia basic information");

    }








}
