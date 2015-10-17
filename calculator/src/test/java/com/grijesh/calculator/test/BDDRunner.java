package com.grijesh.calculator.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by grijesh on 17/10/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "src/test/resources/features/",
        plugin = {"pretty", "html:build/results"},
        dryRun = false,
        glue = "com.grijesh.calculator.test.calculator"
)
public class BDDRunner {
}
