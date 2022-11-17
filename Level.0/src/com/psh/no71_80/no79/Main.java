package com.psh.no71_80.no79;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(numbers));
    }

    static int solution(int[] numbers) {
        numbers = Arrays.stream(numbers).sorted().toArray();
        int max = numbers[numbers.length-1] * numbers[numbers.length-2];

        for (int i = numbers.length - 2; i > 0 ; i--) {
            if (numbers[i] < 0) {
                max = Math.max(max, numbers[i] * numbers[i-1]);
                break;
            }
        }
        return max;
    }
}
