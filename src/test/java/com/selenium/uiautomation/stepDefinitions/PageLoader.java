package com.selenium.uiautomation.stepDefinitions;

import com.selenium.uiautomation.driver.GenericDriver;
import com.selenium.uiautomation.pageObject.CheckboxSelectorPage;
import org.openqa.selenium.WebDriver;

public class PageLoader {

    public WebDriver driver = GenericDriver.getDriver();

    public CheckboxSelectorPage checkboxSelectorPage = new CheckboxSelectorPage(driver);
}
