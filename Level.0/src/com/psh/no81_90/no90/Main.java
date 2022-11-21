package com.psh.no81_90.no90;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int [][] score = new int [n][2];
        for (int i = 0; i < n; i++) {
            score[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(Arrays.toString(solution(score)));
    }

    static int[] solution(int[][] score) {
        int[] sum = new int[score.length];
        Arrays.setAll(sum, i -> score[i][0] + score[i][1]);

        int[] rank = new int[sum.length];
        for (int i = 0; i < rank.length; i++) {
            int n = 1;
            for (int s : sum) {
                if (sum[i] < s) n++;
            }
            rank[i] = n;
        }
        return rank;
    }
}
