package com.psh.no11_20.no13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(solution(n));
    }

    static int solution(int n) {
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }
}
