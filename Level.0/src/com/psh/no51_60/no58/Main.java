package com.psh.no51_60.no58;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        System.out.println(solution(my_string, num1, num2));
    }

    static String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            int k = i;
            if (i == num1) {
                k = num2;
            } else if (i == num2) {
                k = num1;
            }
            sb.append(my_string.charAt(k));
        }
        return sb.toString();
    }
}
