package com.psh.no11_20.no11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] array = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        System.out.print(solution(array));
    }

    static int solution(int[] array) {
        int[] all = new int[1001];
        for (int a : array) all[a]++;

        int max = all[0];
        int mode = 0;
        for (int i = 1; i < 1001; i++) {
            if (all[i] > max) {
                max = all[i];
                mode = i;
            } else if (all[i] == max) {
                mode = -1;
            }
        }
        return mode;
    }
}
