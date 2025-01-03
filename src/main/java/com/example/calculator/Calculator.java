package com.example.calculator;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        //Scanner 메소드 호출
        Scanner sc=new Scanner(System.in);

        //변수들
        int num1=0;
        int num2=0;
        char cal=' ';
        String stop="";

        while(true){
            //숫자와 사칙연산 입력
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            num1=sc.nextInt();
            System.out.print("두번째 숫자를 입력해주세요 : ");
            num2=sc.nextInt();
            System.out.print("적용할 사칙연산을 입력해주세요 : ");
            cal=sc.next().charAt(0);

            //입력한 사칙연산에 따른 결과값 출력
            switch (cal){
                case '+':
                    int a=num1+num2;
                    System.out.println("결과 : "+a);
                    break;
                case '-':
                    int s=num1-num2;
                    System.out.println("결과 : "+s);
                    break;
                case '*':
                    int m=num1*num2;
                    System.out.println("결과 : "+m);
                    break;
                case '/':
                    if(num2==0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)는 0이 될 수 없습니다.");
                    }
                    else{
                        int d=num1/num2;
                        System.out.println("결과 : "+d);
                    }
                    break;
                default:
                    System.out.println("잘못된 사칙연산을 작성하셨습니다!!");
                    break;
            }

            //종료여부에 대한 코드
            System.out.print("더 계산하시겠습니까?(종료를 하고싶다면 exit을 입력해주십시오 : ");
            stop=sc.next();

            if(stop.equals("exit")){
                break;
            }
        }
    }
}