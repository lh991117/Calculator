package com.example.calculatorLV2;

import java.util.*;

public class CalculatorLV2 {
    //필드 캡슐화
    private ArrayList<Integer> cLV2L=new ArrayList<>();
    private int num1, num2;
    private int index=0;
    private char cal;
    private String result;

    public String CalculateLV2() {
        //사칙연산 실행
        switch (cal){
            case '+':
                cLV2L.add(num1+num2);
                result="결과 : "+cLV2L.get(index);
                index++;
                break;
            case '-':
                cLV2L.add(num1-num2);
                result="결과 : "+cLV2L.get(index);
                index++;
                break;
            case '*':
                cLV2L.add(num1*num2);
                result="결과 : "+cLV2L.get(index);
                index++;
                break;
            case '/':
                if(num2==0){
                    result="나눗셈 연산에서 분모(두번째 정수)는 0이 될 수 없습니다.";
                }
                else{
                    cLV2L.add(num1/num2);
                    result="결과 : "+cLV2L.get(index);
                    index++;
                }
                break;
            default:
                result="잘못된 사칙연산을 작성하셨습니다!!";
                break;
        }
        //결과 출력 텍스트 반환
        return result;
    }

    //결과값 반환
    public String getResult(){
        return result;
    }

    //캡슐화된 필드에 main메서드에서 입력된 값 저장
    public void setResult(int num1, int num2, char cal){
        this.num1=num1;
        this.num2=num2;
        this.cal=cal;
    }

    //List에 가장 먼저 저장된 값 제거
    public void remove(){
        cLV2L.remove(0);
        index--;
    }
}
