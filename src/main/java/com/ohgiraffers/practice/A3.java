package com.ohgiraffers.practice;

import java.util.Scanner;

public class A3 {
    public void practiceApplication3(){
        /* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= num) {
            if(num % 2 == 0) {

        }
            sum += i;
            i++;
    }
        System.out.println("1부터  " + num + "까지 짝수의 합은 " + sum + " 입니다.");
    }
}
//