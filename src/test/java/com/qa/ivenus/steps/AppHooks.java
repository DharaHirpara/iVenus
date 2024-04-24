package com.qa.ivenus.steps;

import com.qa.ivenus.propertyreader.PropertyReader;
import com.qa.ivenus.utility.ElementUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks extends ElementUtil {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }


    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final  byte[]  screenshot = getScreenShot();
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        closeBrowser();
    }










}
