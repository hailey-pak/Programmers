package com.n1845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(nums));
    }

    static int solution(int[] nums) {
        int n = nums.length / 2;
        int d = (int) Arrays.stream(nums).distinct().count();
        return Math.min(n, d);
    }
}
