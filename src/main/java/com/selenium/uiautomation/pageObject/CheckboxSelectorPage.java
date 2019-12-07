package com.selenium.uiautomation.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxSelectorPage extends BasePage {

    @FindBy(id = "selectMePlease")
    private WebElement checkbox;

    public CheckboxSelectorPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void selectCheckBox(){
        if(!isTheCheckboxSelected()){
            checkbox.click();
        }
    }

    public void unSelectCheckBox(){
        if(isTheCheckboxSelected()){
            checkbox.click();
        }
    }

    public boolean isTheCheckboxSelected() {
        return checkbox.isSelected();
    }
}
