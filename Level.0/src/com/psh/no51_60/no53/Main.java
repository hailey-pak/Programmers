package com.psh.no51_60.no53;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] array = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        System.out.print(solution(array, n));
    }

    static int solution(int[] array, int n) {
        int min = array[0];
        for (int a : array) {
            int val = Math.abs(a - n);
            if (Math.abs(min - n) > val) {
                min = a;
            }
            if (Math.abs(min - n) == val) {
                min = Math.min(min, a);
            }
        }
        return min;
    }
}
