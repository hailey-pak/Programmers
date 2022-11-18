package com.psh.no81_90.no83;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] sides = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(sides));
    }

    static int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int cnt  = 0;

        //x가 제일 긴 경우 -> (a+b) > x
        for (int i = Math.max(a, b); i < a + b; i++) {
            cnt++;
        }

        //a,b 중 제일 긴 변이 있는 경우 -> min(a,b) + x > max(a,b)
        for (int i = 1 ; i < Math.max(a,b); i++) {
            if (i + Math.min(a, b) > Math.max(a,b)) {
                cnt++;
            }
        }
        return cnt;
    }
}
