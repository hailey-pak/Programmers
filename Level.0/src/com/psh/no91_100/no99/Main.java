package com.psh.no91_100.no99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = sc.nextInt();
        System.out.println(Arrays.toString(solution(num, total)));
    }

    static int[] solution(int num, int total) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = total / num;

        if (total % num == 0) {
            for (int i = a - num/2; i <= a + num/2; i++) {
                list.add(i);
            }
        } else {
            for (int i = (a - num/2) + 1; i <= a + num/2; i++) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
