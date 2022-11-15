package com.psh.no71_80.no71;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(solution(n, t));
    }

    static int solution(int n, int t) {
        for (int i = 0; i < t; i++) {
            n = n * 2;
        }
        return n;
    }
}
