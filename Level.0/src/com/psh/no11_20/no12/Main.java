package com.psh.no11_20.no12;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(Arrays.toString(solution(n)));
    }

    static int[] solution(int n) {
        int[] answer = new int[n % 2 == 0 ? n / 2 : n / 2 + 1];
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer[a++] = i;
            }
        }
        return answer;
    }
}
