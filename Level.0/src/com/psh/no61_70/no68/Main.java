package com.psh.no61_70.no68;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] quiz = new String[n];
        for (int i = 0; i < n; i++) {
            quiz[i] = br.readLine();
        }
        System.out.println(Arrays.toString(solution(quiz)));
    }

    static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int ans;

            if (str[1].equals("+")){
                ans = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
            } else {
                ans = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
            }
            answer[i] = ans == Integer.parseInt(str[4]) ? "O" : "X";
        }
        return answer;
    }
}
