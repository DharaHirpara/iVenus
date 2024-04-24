package com.qa.ivenus.pages;

import com.qa.ivenus.utility.ElementUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ElementUtil {
    //By locator
    //Constr
    //methods

    //after test run we get the log
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());

    @CacheLookup //fast execution
    @FindBy(xpath ="//div[@class='site-primary-header-wrap ast-builder-grid-row-container site-header-focus-item ast-container']//span[@class='ahfb-svg-iconset ast-inline-flex svg-baseline']//*[name()='svg']") //By locator
    WebElement registerIcon;

    public void clickOnRegisterIcon(){
        clickOnElement(registerIcon);

        log.info("Clicking on resister icon"+registerIcon.toString());
    }














}
