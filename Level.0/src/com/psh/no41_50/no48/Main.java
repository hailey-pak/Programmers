package com.psh.no41_50.no48;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(Arrays.toString(solution(n)));
    }

    static int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        int i = 2;
        while (n != 1) {
            if (n % i == 0) {
                n /= i;
                set.add(i);
            } else {
                i++;
            }
        }
        if (set.size() == 0) return new int[]{n};

        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
