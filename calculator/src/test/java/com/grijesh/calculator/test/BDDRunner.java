package com.grijesh.calculator.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by grijesh on 17/10/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/"},
        features = "src/test/resources/features/",
        dryRun = false,
        glue = "com.grijesh.calculator.test.calculator"
)
public class BDDRunner {
}
