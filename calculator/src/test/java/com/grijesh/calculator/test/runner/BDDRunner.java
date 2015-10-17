package com.grijesh.calculator.test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by grijesh on 17/10/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "json:target/"})
public class BDDRunner {
}
