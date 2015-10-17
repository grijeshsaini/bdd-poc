package com.grijesh.calculator;

/**
 * Created by grijesh on 17/10/15.
 */
public class CalculatorImpl implements Calculator {

    @Override
    public Number add(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }

    @Override
    public Number subtract(Number a, Number b) {
        return null;
    }
}
