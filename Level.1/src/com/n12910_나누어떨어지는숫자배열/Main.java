package com.n12910_나누어떨어지는숫자배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int divisor = Integer.parseInt(br.readLine());

        System.out.println(Arrays.toString(solution(arr, divisor)));
        br.close();
    }

    static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int a : arr) {
            if (a % divisor == 0) {
                list.add(a);
            }
        }
        int[] answer;
        if ( list.size()==0) {
            answer = new int[]{-1};
        } else {
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}
