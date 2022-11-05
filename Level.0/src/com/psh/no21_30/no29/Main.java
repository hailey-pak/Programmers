package com.psh.no21_30.no29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int[] numbers = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        System.out.println(Arrays.toString(solution(numbers, num1, num2)));
    }

    static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[i+num1];
        }
        return answer;
    }
}
