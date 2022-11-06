package com.psh.no31_40.no33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hp = new Scanner(System.in).nextInt();
        System.out.print(solution(hp));
    }

    static int solution(int hp) {
        int cnt = 0;
        if (hp / 5 > 0) {
            cnt += hp / 5;
            hp = hp % 5;
        }
        if (hp / 3 > 0) {
            cnt += hp / 3;
            hp = hp % 3;
        }
        if (hp > 0) {
            cnt += hp;
        }
        return cnt;
    }
}
