package com.psh.no31_40.no31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] emergency = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        System.out.print(Arrays.toString(solution(emergency)));
    }

    static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < answer.length; i++) {
            int sum = 1;
            for (int j = 0; j < answer.length; j++) {
                if (emergency[i] < emergency[j]) sum++;
            }
            answer[i] = sum;
        }
        return answer;
    }
}
