package com.psh.no31_40.no38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int[] num_list = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        int[][] answer = solution(num_list, n);
        for (int[] ans : answer) {
            System.out.println(Arrays.toString(ans));
        }
    }

    static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int cnt = 0;
        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[cnt++];
            }
        }
        return answer;
    }
}
