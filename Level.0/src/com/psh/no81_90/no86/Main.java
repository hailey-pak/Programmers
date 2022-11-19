package com.psh.no81_90.no86;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] dots = new int[4][2];
        for (int i = 0; i < 4; i++) {
            dots[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(solution(dots));
        br.close();
    }

    static int solution(int[][] dots) {
        double slope = (double)(dots[0][1]-dots[1][1]) / (dots[0][0]-dots[1][0]);
        double slope2 = (double)(dots[2][1]-dots[3][1]) / (dots[2][0]-dots[3][0]);
        if (slope == slope2) return 1;

        slope = (double)(dots[0][1]-dots[2][1]) / (dots[0][0]-dots[2][0]);
        slope2 = (double)(dots[1][1]-dots[3][1]) / (dots[1][0]-dots[3][0]);
        if (slope == slope2) return 1;

        slope = (double)(dots[0][1]-dots[3][1]) / (dots[0][0]-dots[3][0]);
        slope2 = (double)(dots[1][1]-dots[2][1]) / (dots[1][0]-dots[2][0]);
        return slope == slope2 ? 1 : 0;
    }
}
