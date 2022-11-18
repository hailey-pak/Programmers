package com.psh.no81_90.no82;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][];
        for (int i = 0; i < n; i++) {
            board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(solution(board));
    }

    static int solution(int[][] board) {
        boolean[][] bool = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int n = board[i][j];

                if (n == 1) {
                    bool[i][j] = true;

                    if (i - 1 >= 0) {
                        bool[i-1][j] = true;
                        if (j - 1 >= 0) bool[i-1][j-1] = true;
                        if (j + 1 < board.length) bool[i-1][j+1] = true;
                    }

                    if (i + 1 < board.length) {
                        bool[i+1][j] = true;
                        if (j -1 >= 0) bool[i+1][j-1] = true;
                        if (j + 1 < board.length) bool[i+1][j+1] = true;
                    }

                    if (j - 1 >= 0) bool[i][j-1] = true;
                    if (j + 1 < board.length) bool[i][j+1] = true;
                }
            }
        }

        int answer = 0;
        for (boolean[] booleans : bool) {
            for (boolean b : booleans) {
                if (!b) answer++;
            }
        }
        return answer;
    }
}
