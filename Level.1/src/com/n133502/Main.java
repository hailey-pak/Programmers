package com.n133502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ingredient = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(ingredient));
        br.close();
    }

    //시간초과
    static int solution(int[] ingredient) {
        String hamburger = "1231";
        StringBuilder sb = new StringBuilder();
        for (int i : ingredient) {
            sb.append(i);
        }
        String stack = sb.toString();
        int n = 0;
        for (int i = 0; i < ingredient.length / 4; i++) {
            if (stack.contains(hamburger)) {
                stack = stack.replaceFirst(hamburger, "");
                n++;
            }
        }

        return n;
    }
}
