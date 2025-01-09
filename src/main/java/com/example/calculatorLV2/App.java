package com.example.calculatorLV2;

import java.util.*;

public class App {
    public static void main(String args[]){
        CalculatorLV2 c2=new CalculatorLV2();
        Scanner sc=new Scanner(System.in);

        int num1, num2;
        char cal;
        String ask;
        String stop;

        while(true){
            //숫자와 사칙연산 입력
            //첫번째 숫자 예외 처리
            while(true){
                try{
                    System.out.print("첫번째 숫자를 입력해주세요 : ");
                    num1=sc.nextInt();
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
                    num2=sc.nextInt();
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
                cal=sc.next().charAt(0);
                sc.nextLine();//버퍼 비우기

                if(cal == '+' || cal == '-' || cal == '*' || cal == '/'){
                    break;
                }
                else{
                    System.out.println("사칙연산만 입력해주세요!");
                }
            }

            //set메서드를 통한 CalculatorLV2필드의 값 추가
            c2.setResult(num1, num2, cal);
            //사칙 연산 실행
            c2.CalculateLV2();
            //get메서드를 통해서 결과값 출력
            System.out.println(c2.getResult());
            //결과 출력 후 결과를 저정한 리스트의 값 삭제 여부
            while (true){
                System.out.print("저장된 계산 결과를 삭제하시겠습니까(Y/N)");
                ask=sc.next();

                if(ask.equals("Y")){
                    c2.remove();
                    break;
                }
                else if(ask.equals("N")){
                    break;
                }
                else{
                    System.out.println("다시 입력해주세요.");
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
