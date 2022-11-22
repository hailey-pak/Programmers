package com.psh.no91_100.no95;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String before = sc.nextLine();
        String after = sc.nextLine();
        System.out.println(solution(before, after));
    }

    static int solution(String before, String after) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < before.length(); i++) {
            sum1 += before.charAt(i);
            sum2 += after.charAt(i);
        }
        return sum1 == sum2 ? 1 : 0;
    }
}
