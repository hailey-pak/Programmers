package com.psh.no11_20.no18;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int money = new Scanner(System.in).nextInt();
        System.out.print(Arrays.toString(solution(money)));
    }

    static int[] solution(int money) {
        return new int[]{money / 5500, money % 5500};
    }
}
