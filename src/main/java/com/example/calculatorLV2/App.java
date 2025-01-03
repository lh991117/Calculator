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
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            num1=sc.nextInt();
            System.out.print("두번째 숫자를 입력해주세요 : ");
            num2=sc.nextInt();
            System.out.print("적용할 사칙연산을 입력해주세요 : ");
            cal=sc.next().charAt(0);

            //set메서드를 통한 CalculatorLV2필드의 값 추가
            c2.setResult(num1, num2, cal);
            //사칙 연산 실행
            c2.CalculateLV2();
            //get메서드를 통해서 결과값 출력
            System.out.println(c2.getResult());
            //결과 출력 후 결과를 저정한 리스트의 값 삭제 여부
            while (true){
                System.out.print("계산 결과를 삭제하시겠습니까(Y/N)");
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
