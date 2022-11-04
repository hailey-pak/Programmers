package com.psh.no21_30.no28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(solution(n));
    }

    static int solution(int n) {
        int sum = 0;
        if (n < 2) return 0;
        for (int i = 2; i <= n; i = i + 2) {
            sum += i;
        }
        return sum;
    }
}
