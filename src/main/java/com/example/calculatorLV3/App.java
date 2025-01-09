package com.example.calculatorLV3;

import java.util.*;

public class App {
    public static void main(String args[]){
        ArithmeticCalculator<Double> c3=new ArithmeticCalculator<>();
        Scanner sc=new Scanner(System.in);

        double num1, num2, askNum;
        String s;
        String ask1, ask2;
        String stop;
        boolean answer;

        while(true){
            //숫자와 사칙연산 입력
            //첫번째 숫자 예외 처리
            while(true){
                try{
                    System.out.print("첫번째 숫자를 입력해주세요 : ");
                    num1=sc.nextDouble();
                    sc.nextLine();//버퍼를 비운다

                    //양의 정수(0 포함)만 받기 위한 조건
                    if(num1<0){
                        System.out.println("0 이상의 숫자만 입력해주세요!");
                    }
                    else{
                        break;
                    }
                }catch(Exception e){//숫자가 아닌 문자를 입력할 경우
                    sc.nextLine();//버퍼를 비운다(비우지 않은 경우 무한 반복 되기 떄문에)
                    System.out.println("숫자만 입력해주세요!");
                }
            }
            //두번째 숫자 예외처리
            while(true){
                try{
                    System.out.print("두번째 숫자를 입력해주세요 : ");
                    num2=sc.nextDouble();
                    sc.nextLine();//버퍼를 비운다

                    //양의 정수(0 포함)만 받기 위한 조건
                    if(num2<0){
                        System.out.println("0 이상의 숫자만 입력해주세요!");
                    }
                    else{
                        break;
                    }
                }catch(Exception e){//숫자가 아닌 문자를 입력할 경우
                    sc.nextLine();//버퍼를 비운다(비우지 않은 경우 무한 반복 되기 떄문에)
                    System.out.println("숫자만 입력해주세요!");
                }
            }
            //사칙연산 처리
            while(true){
                System.out.print("적용할 사칙연산을 입력해주세요 : ");
                s=sc.nextLine();

                if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                    break;
                }
                else{
                    System.out.println("사칙연산만 입력해주세요!");
                }
            }

            //set메서드를 통한 CalculatorLV3필드의 값 추가
            c3.setResult(num1, num2, s);
            //사칙 연산 실행
            c3.Calculate();
            //get메서드를 통해서 결과값 출력
            System.out.println(c3.getResult());

            //list값 조회 여부
            while(true){
                System.out.print("저장된 값을 출력하고 싶으십니까?(Y/N) : ");
                ask1=sc.nextLine();

                if(ask1.equals("Y")){
                    answer=true;
                    break;
                }
                else if(ask1.equals("N")){
                    answer=false;
                    break;
                }
                else{
                    System.out.println("Y나 N 둘 중 하나만 입력하세요!");
                }
            }

            //list에서 입력된 숫자보다 더 큰 숫자만 출력
            if(answer){
                while (true){
                    try{
                        System.out.print("조회하기 위해서 기준이 될 숫자를 입력해주세요 : ");
                        askNum=sc.nextDouble();
                        sc.nextLine();

                        //list 조회
                        System.out.println(askNum+"보다 큰 결과값들 입니다!");
                        c3.listCheck(askNum);
                        break;
                    }catch(Exception e){
                        sc.nextLine();
                        System.out.println("숫자만 입력해주세요!");
                    }
                }
            }

            //종료여부에 대한 코드
            System.out.print("더 계산하시겠습니까?(종료를 하고싶다면 exit을 입력해주십시오) : ");
            stop=sc.next();

            if(stop.equals("exit")){
                break;
            }
        }
    }
}
