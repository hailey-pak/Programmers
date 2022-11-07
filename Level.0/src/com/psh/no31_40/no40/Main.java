package com.psh.no31_40.no40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] numbers = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();

        String direction = br.readLine();
        System.out.print(Arrays.toString(solution(numbers, direction)));
    }

    static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < answer.length; i++) {
            int idx = i;
            if (direction.equals("right")) {
                idx = idx - 1 < 0 ? answer.length - 1 : idx - 1;
            } else {
                idx = idx + 1 > answer.length - 1 ? 0 : idx + 1;
            }
            answer[i] = numbers[idx];
        }
        return answer;
    }
}
