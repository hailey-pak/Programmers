package com.psh.no71_80.no73;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(array));
    }

    static int solution(int[] array) {
        int cnt = 0;
        for (int j : array) {
            int n = j;
            while (n > 0) {
                if (n % 10 == 7) cnt++;
                n /= 10;
            }
        }
        return cnt;
    }
}
