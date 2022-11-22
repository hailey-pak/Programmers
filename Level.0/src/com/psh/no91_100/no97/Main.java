package com.psh.no91_100.no97;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println(solution(A, B));
    }

    static int solution(String A, String B) {
        if (A.equals(B)) return 0;
        for (int i = 0; i < A.length(); i++) {
            A = A.charAt(A.length()-1) + A.substring(0, A.length()- 1);
            if (A.equals(B)) return i + 1;
        }
        return -1;
    }
}
