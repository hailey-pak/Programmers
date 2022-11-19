package com.psh.no81_90.no87;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] lines = new int[3][2];
        for (int i = 0; i < 3; i++) {
            lines[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(solution(lines));
        br.close();
    }

    static int solution(int[][] lines) {
        int[] count = new int[201];

        for (int[] line : lines) {
            int min = Math.min(line[0], line[1]);
            int max = Math.max(line[0], line[1]);

            for (int j = min; j < max; j++) {
                count[j + 100]++;
            }
        }

        int ans = 0;
        for (int n : count) {
            if (n >= 2) ans++;
        }
        return ans;
    }
}
