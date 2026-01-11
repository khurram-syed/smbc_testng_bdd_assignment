
package com.smbc.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com/smbc/steps"},
        plugin = {"html:reports/index.html"},
        monochrome = true
        //tags = "@smoke"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
