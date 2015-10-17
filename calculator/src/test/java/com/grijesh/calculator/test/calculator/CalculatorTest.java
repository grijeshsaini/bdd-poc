package com.grijesh.calculator.test.calculator;

import com.grijesh.calculator.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by grijesh on 17/10/15.
 */
public class CalculatorTest {

    private Calculator calculator;

    @Given("^Calculator is turned on$")
    public void calculator_is_turned_on() throws Throwable {
       calculator = new Calculator();
    }

    @Given("^reset calculator$")
    public void resetCurrentState() throws Throwable{
        calculator.setCurrentState(0);
    }

    @When("^I add (.+)$")
    public void addFirst(int firstNumber) throws Throwable {
        calculator.add(firstNumber);
    }

    @When("^add (.+)$")
    public void addSecond(int secondNumber) throws Throwable {
        calculator.add(secondNumber);
    }

    @Then("^result should be (.+)$")
    public void result_should_be(int result) throws Throwable {
        Assert.assertTrue(calculator.getCurrentState()== result);
    }

    @When("^subtract (.+)$")
    //Replaced \\d+ to .+ to support double or float number
    public void subtract(int number) throws Throwable {
        calculator.subtract(number);
    }

}
