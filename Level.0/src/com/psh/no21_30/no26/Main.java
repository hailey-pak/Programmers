package com.psh.no21_30.no26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int angle = new Scanner(System.in).nextInt();
        System.out.println(solution(angle));
    }

    static int solution(int angle) {
        if (angle > 0 && angle < 90)  return 1;
        if (angle == 90) return 2;
        if (angle > 90 && angle < 180) return 3;
        else return 4;
    }
}
