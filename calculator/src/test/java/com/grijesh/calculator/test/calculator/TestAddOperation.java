package com.grijesh.calculator.test.calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.security.util.PendingException;

/**
 * Created by grijesh on 17/10/15.
 */
public class TestAddOperation {

    @Given("^two variables \\( (\\d+), (\\d+)\\)$")
    public void two_variables(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^add two variables \\((\\d+) \\+ (\\d+)\\)$")
    public void add_two_variables(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^it should return (\\d+)$")
    public void it_should_return(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
