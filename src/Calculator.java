//Name: Ryan Duncan
//Course: CSE 1322 Lab W01
//Date: 9/28/2020
//Lab 7

//Calculator class implements ICalcOp and defines setters, getters, and constructors

public class Calculator implements ICalcOp {


    private String operation = " ";


    public Calculator(String op){
        operation = op;
    }

    public Calculator(){

    }

    @Override
    public float addition(float num1, float num2){
        float sum = num1 + num2;
        operation = "ADDITION";

        return sum;
    }

    @Override
    public float subtraction(float num1, float num2){
        float difference = num1 - num2;

        operation = "SUBTRACTION";

        return difference;
    }

    @Override
    public float multiplication(float num1, float num2){
        float product = num1 * num2;

        operation = "MULTIPLICATION";

        return product;
    }

    @Override
    public float division(float num1, float num2){
        float quotient = num1/num2;

        operation = "DIVISION";

        return quotient;
    }

    @Override
    public String toString(){
        return "Operation: " + operation;
    }

    public void setOperation(String a){
        operation = a;
    }

    public String getOperation(){
        return operation;
    }
}
