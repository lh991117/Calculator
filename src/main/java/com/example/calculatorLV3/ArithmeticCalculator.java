package com.example.calculatorLV3;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number>{
    private ArrayList<Double> list=new ArrayList<>();
    private ArrayList<Double> checkList=new ArrayList<>();
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

    public void listCheck(T askNum){
        //람다식과 스트림을 활용한 조회 메서드 구현
        checkList.clear();
        list.stream()
                //filter메서드를 통해서 list 안에서 askNum보다 큰 값을 조회
                .filter(value -> value > askNum.doubleValue())
                //list에서 조회한 개수만큼 checkList에 값을 추가
                .forEach(checkList::add);
        System.out.println(checkList);
        //조회 메서드
//        checkList.clear();
//        for(int i=0;i<list.size();i++){
//            if(list.get(i)>askNum.doubleValue()){
//                checkList.add(list.get(i));
//            }
//        }
//        System.out.println(checkList);
    }
}
