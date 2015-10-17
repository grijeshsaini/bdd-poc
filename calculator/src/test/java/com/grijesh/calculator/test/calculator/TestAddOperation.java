package com.grijesh.calculator.test.calculator;

import com.grijesh.calculator.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by grijesh on 17/10/15.
 */
public class TestAddOperation {

    private Calculator calculator;

    @Given("^Calculator is turned on$")
    public void calculator_is_turned_on() throws Throwable {
       calculator = new Calculator();
    }

    @When("^I add (\\d+)$")
    public void addFirst(int firstNumber) throws Throwable {
        calculator.add(firstNumber);
    }

    @When("^add (\\d+)$")
    public void addSecond(int secondNumber) throws Throwable {
        calculator.add(secondNumber);
    }

    @Then("^result should be (\\d+)$")
    public void result_should_be(int result) throws Throwable {
        Assert.assertTrue(calculator.getCurrentState()== result);
    }

}
