package com.n12916_문자열내p와y의개수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.next()));
    }

    static boolean solution(String s) {
        int cnt = 0;
        for (Character c : s.toCharArray()) {
            if (c == 80 || c == 112) cnt++;
            if (c == 89 || c == 121) cnt--;
        }
        return cnt == 0;
    }
}
