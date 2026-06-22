package com.example.calculator.model;

public class OperationResponse {

    private String operation;
    private int operandA;
    private int operandB;
    private int result;

    public OperationResponse() {
    }

    public OperationResponse(String operation,
                             int operandA,
                             int operandB,
                             int result) {

        this.operation = operation;
        this.operandA = operandA;
        this.operandB = operandB;
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getOperandA() {
        return operandA;
    }

    public void setOperandA(int operandA) {
        this.operandA = operandA;
    }

    public int getOperandB() {
        return operandB;
    }

    public void setOperandB(int operandB) {
        this.operandB = operandB;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "OperationResponse{" +
                "operation='" + operation + '\'' +
                ", operandA=" + operandA +
                ", operandB=" + operandB +
                ", result=" + result +
                '}';
    }

}
