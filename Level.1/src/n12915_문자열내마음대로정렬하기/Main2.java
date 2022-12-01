package com.n12915_문자열내마음대로정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(str, n)));
    }

    static String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
            StringBuilder sb = new StringBuilder(strings[i]);
            strings[i] = sb.insert(0, sb.charAt(n)).toString();
        }

        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }
        return strings;
    }
}
