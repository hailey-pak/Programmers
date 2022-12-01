package com.n12931;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }
}
