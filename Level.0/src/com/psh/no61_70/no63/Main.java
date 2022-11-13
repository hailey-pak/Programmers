package com.psh.no61_70.no63;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(solution(br.readLine()));
    }

    static int solution(String my_string) {
        String[] str = my_string.split(" ");
        int ans = Integer.parseInt(str[0]);
        for (int i = 1; i < str.length; i++) {
            if (str[i].equals("+")) {
                ans += Integer.parseInt(str[i+1]);
            }
            if (str[i].equals("-")) {
                ans -= Integer.parseInt(str[i+1]);
            }
        }
        return ans;
    }
}
