package com.seltests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features",
        glue = "com.seltests.steps",
        tags = "@RegressionTest",
        plugin = {"pretty","html:target/cucumber-report.html"}
)

public class TestRunnerRegression extends AbstractTestNGCucumberTests {

    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
