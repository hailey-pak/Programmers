package com.psh.no91_100.no98;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(solution(M, N));
    }

    static int solution(int M, int N) {
        int cnt = 0;

        if (M > 1) {
            cnt = M - 1;
            if (N > 1) cnt += (N - 1) * M;
        } else {
            if (N > 1) cnt = N - 1;
        }

        return cnt;
    }
}
