package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromTwoToNine(){

        for (int dan = 2; dan < 10; dan++) {
            for(int su = 1; su < 10; su++){
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void printStatInputRowTimes(){

        /* 키보드로 정수를 하나 입력 받아 해당 점수 만큼 한 행에 "*"을 5개씩 출력하세요 */
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        // 입력한 행 만큼 반복
        for(int i = 1; i <= row; i++){

            // 별을 5개 출력하는 것을 반복
            for(int j = 1; j < 6; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
