package com.psh.no91_100.no96;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(i, j, k));
    }

    static int solution(int i, int j, int k) {
        int cnt = 0;
        for (int n = i; n <= j; n++) {
            String s = String.valueOf(n);
            for (char c : s.toCharArray()) {
                if (c == Character.forDigit(k, 10)) cnt++;
            }
        }
        return cnt;
    }
}
