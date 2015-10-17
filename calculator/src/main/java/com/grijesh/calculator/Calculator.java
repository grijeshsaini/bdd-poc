package com.grijesh.calculator;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by grijesh on 17/10/15.
 *
 */
@Getter
@Setter
public class Calculator {

    private double currentState = 0;

    public void add(Number a) {
        currentState += a.doubleValue();
    }

    public void subtract(Number a) {
        currentState -= a.doubleValue();
    }


}
