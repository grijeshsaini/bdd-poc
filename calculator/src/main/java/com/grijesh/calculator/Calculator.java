package com.grijesh.calculator;

import java.math.BigInteger;

/**
 * Created by grijesh on 17/10/15.
 */
public interface Calculator<T extends Number> {

    public T add(T a, T b);

    public T subtract(T a , T b);

}
