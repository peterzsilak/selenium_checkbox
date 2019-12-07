package com.selenium.uiautomation.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckboxSelectionSteps extends PageLoader {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before
    public void setup() {
        driver.get("http://localhost");
        if(driver.getTitle().equals("Checkbox selector page")){
            logger.info("Page loaded in successfully.");
        }
    }

    @Given("an unchecked Checkbox")
    public void an_unchecked_Checkbox() {
        logger.info("Checkbox status is: " + checkboxSelectorPage.isTheCheckboxSelected());
    }

    @When("the user clicks on it")
    public void the_user_clicks_on_it() {
        checkboxSelectorPage.selectCheckBox();
    }

    @Then("the checkbox has been selected")
    public void the_checkbox_has_been_selected() {
        logger.info("Checkbox status is: " + checkboxSelectorPage.isTheCheckboxSelected());
    }

    @After
    public void teardown(){
        driver.close();
        driver = null;
    }


}
