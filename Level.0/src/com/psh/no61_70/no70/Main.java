package com.psh.no61_70.no70;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}
