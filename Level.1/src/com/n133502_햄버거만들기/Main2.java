package com.n133502_햄버거만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ingredient = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(ingredient));
        br.close();
    }

    static int solution(int[] ingredient) {
        int n = 0;
        StringBuilder sb = new StringBuilder();

        for (int i : ingredient) {
            sb.append(i);
            if (sb.length() > 3 && sb.substring(sb.length()-4, sb.length()).equals("1231")) {
                sb.delete(sb.length()-4, sb.length());
                n++;
            }
        }

        return n;
    }
}
