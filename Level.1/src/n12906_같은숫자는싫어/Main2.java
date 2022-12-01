package com.n12906_같은숫자는싫어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int a : arr) {
            if (stack.peek() != a) {
                stack.push(a);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
