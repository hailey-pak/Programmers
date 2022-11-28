package com.psh.no91_100.no93;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chicken = new Scanner(System.in).nextInt();
        System.out.println(solution(chicken));
    }

    static int solution(int chicken) {
        int answer = 0;
        if (chicken < 10) return answer;

        do {
            answer += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
        } while (chicken >= 10);

        return answer;
    }
}
