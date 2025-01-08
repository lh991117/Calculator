package com.example.calculatorLV3;

public class ArithmeticCalculator{
    private double num1;
    private double num2;
    private String s;
    private String result;

    public String Calculate(){
        //예외처리를 이용한 사칙연산 실행
        try{
            if(OperatorType.Add.isEqual(s)){
                result="결과 : "+(num1+num2);
            }
            else if(OperatorType.Substract.isEqual(s)){
                result="결과 : "+(num1-num2);
            }
            else if(OperatorType.Multiply.isEqual(s)){
                result="결과 : "+(num1*num2);
            }
            else if(OperatorType.Divide.isEqual(s)){
                result="결과 : "+(num1/num2);
            }
        }catch(Exception e){
            result="잘못된 사칙연산을 작성하셨습니다!!";
        }
        return result;
    }
}
