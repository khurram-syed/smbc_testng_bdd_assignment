
package com.smbc.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


/**
 * TestNG runner for executing Cucumber scenarios.
 * Supports parallel execution at scenario level.
 */
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.smbc.steps"},
        plugin = {"html:reports/index.html"},
        monochrome = true
        //tags = "@smoke"
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }


}
