package com.grijesh.calculator.test.calculator;

import com.grijesh.calculator.Calculator;
import com.grijesh.calculator.CalculatorImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by grijesh on 17/10/15.
 */
public class TestAddOperation {

    private Calculator calculator;

    @Given("^Calculator is initialized$")
    public void initializedCalculator() throws Throwable {
        calculator = new CalculatorImpl();
    }

    @When("^add two variables \"([^\"]*)\" \"([^\"]*)\"$")
    public void shouldAddVarialble(String arg1, String arg2) throws Throwable {
        System.out.println("test1");
    }

    @Then("^(\\d+) should be returned$")
    public void sumShouldBeReturned(int arg1) throws Throwable {
        System.out.println("test2");
    }

}
