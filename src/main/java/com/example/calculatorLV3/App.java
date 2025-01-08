package com.example.calculatorLV3;

import java.util.*;

public class App {
    public static void main(String args[]){
        ArithmeticCalculator<Double> c3=new ArithmeticCalculator<>();
        Scanner sc=new Scanner(System.in);

        double num1, num2;
        String s;

        String stop;

        while(true){
            //숫자와 사칙연산 입력
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            num1=sc.nextInt();
            System.out.print("두번째 숫자를 입력해주세요 : ");
            num2=sc.nextInt();
            System.out.print("적용할 사칙연산을 입력해주세요 : ");
            s=sc.next();

            //set메서드를 통한 CalculatorLV2필드의 값 추가
            c3.setResult(num1, num2, s);
            //사칙 연산 실행
            c3.Calculate();
            //get메서드를 통해서 결과값 출력
            System.out.println(c3.getResult());

            //종료여부에 대한 코드
            System.out.print("더 계산하시겠습니까?(종료를 하고싶다면 exit을 입력해주십시오) : ");
            stop=sc.next();

            if(stop.equals("exit")){
                break;
            }
        }
    }
}
