package ua.goit.java;

import java.math.BigDecimal;

public class Dividing implements Operation {
    @Override
    public BigDecimal count(BigDecimal bigDecimal, BigDecimal bigDecimal1) {
        return bigDecimal.divide(bigDecimal1);
    }

    @Override
    public char getOperator() {
        return '/';
    }
}
