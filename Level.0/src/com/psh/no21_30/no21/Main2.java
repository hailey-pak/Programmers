package com.psh.no21_30.no21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        System.out.print(solution(my_string));
    }

    static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        return sb.reverse().toString();
    }
}
