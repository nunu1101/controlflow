package com.ohgiraffers.section01.conditional.practice.level2;

import java.util.Scanner;

public class A1 {

    /* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
     * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
     * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
     * */
    public void conditionC() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력해주세요 : ");
        int num = sc.nextInt();

        if (num > 0) {
            if(num % 2 == 0){
                System.out.println("짝수다.");
            }
            else {
                System.out.println("홀수다.");
            }
        } else if (num < 10) {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }
    }

}
