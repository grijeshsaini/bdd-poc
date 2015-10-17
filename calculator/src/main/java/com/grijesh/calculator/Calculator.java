package com.grijesh.calculator;

import lombok.Getter;

/**
 * Created by grijesh on 17/10/15.
 *
 */
@Getter
public class Calculator {

    private double currentState = 0;

    public void add(Number a) {
        currentState += a.doubleValue();
    }

    public Number subtract(Number a) {
        return null;
    }


}
