package com.n12901_2016년;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a, b));
    }

    static String solution(int a, int b) {
        //2016년 1월 1일 ->  금요일
        String[] week = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int day = b;
        if (a > 1) {
            for (int i = 1; i < a; i++) {
                if (i==4 || i==6 || i==9 || i==11) {
                    day += 30;
                } else if (i==2) {
                    day += 29;
                } else {
                    day += 31;
                }
            }
        }
        return week[day%7];
    }
}
