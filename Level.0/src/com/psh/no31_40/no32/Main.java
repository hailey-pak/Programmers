package com.psh.no31_40.no32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(solution(n));
    }

    static int solution(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) cnt++;
        return cnt;
    }
}
