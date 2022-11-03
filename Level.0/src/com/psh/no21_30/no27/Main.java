package com.psh.no21_30.no27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(solution(n, k));
    }

    static int solution(int n, int k) {
        return n * 12000 + (k - (n / 10)) * 2000;
    }
}
