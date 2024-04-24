package com.qa.ivenus.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/qa/ivenus/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json",
                "pretty"},
        tags = "@smoke",
        monochrome=true //give me proper console output
)
public class RunCukeTest extends AbstractTestNGCucumberTests {
}
