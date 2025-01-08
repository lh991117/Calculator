package com.example.calculatorLV3;

public enum OperatorType {
    Add("+"),
    Substract("-"),
    Multiply("*"),
    Divide("/");

    private String operator;

    OperatorType(String operator) {
        this.operator = operator;
    }

    public boolean isEqual(String operator){
        return this.operator.equals(operator);
    }
}
