package com.psh.no81_90.no90;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main2 {
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
        return Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0)).mapToInt(d -> Arrays.stream(score)
                        .map(ints -> Arrays.stream(ints).average().orElse(0)).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).indexOf(d) + 1).toArray();
    }
}
