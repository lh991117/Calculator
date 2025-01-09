package com.example.calculatorLV3;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number>{
    private ArrayList<Double> list=new ArrayList<>();
    private T num1;
    private T num2;
    private String s;
    private String result;

    public String Calculate(){
        //예외처리를 이용한 사칙연산 실행
        try{
            if(OperatorType.Add.isEqual(s)){
                list.add(num1.doubleValue()+num2.doubleValue());
                result="결과 : "+(num1.doubleValue()+num2.doubleValue());
            }
            else if(OperatorType.Substract.isEqual(s)){
                list.add(num1.doubleValue()-num2.doubleValue());
                result="결과 : "+(num1.doubleValue()-num2.doubleValue());
            }
            else if(OperatorType.Multiply.isEqual(s)){
                list.add(num1.doubleValue()*num2.doubleValue());
                result="결과 : "+(num1.doubleValue()*num2.doubleValue());
            }
            else if(OperatorType.Divide.isEqual(s)){
                list.add(num1.doubleValue()/num2.doubleValue());
                result="결과 : "+(num1.doubleValue()/num2.doubleValue());
            }
        }catch(Exception e){
            result="잘못된 사칙연산을 작성하셨습니다!!";
        }
        return result;
    }

    public String getResult(){
        return result;
    }

    public void setResult(T num1, T num2, String s){
        this.num1 = num1;
        this.num2 = num2;
        this.s = s;
    }
}
