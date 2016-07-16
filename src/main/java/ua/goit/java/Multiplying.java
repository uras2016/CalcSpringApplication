package ua.goit.java;

import java.math.BigDecimal;

public class Multiplying implements Operation {

    @Override
    public BigDecimal count(BigDecimal v, BigDecimal v1) {
        return v.multiply(v1);
    }

    @Override
    public char getOperator() {
        return '*';
    }
}
