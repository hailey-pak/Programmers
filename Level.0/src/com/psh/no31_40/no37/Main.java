package com.psh.no31_40.no37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] dot = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        System.out.print(solution(dot));
    }

    static int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        }
        if (dot[0] > 0 && dot[1] < 0) {
            return 4;
        }
        if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        }
        else return 3;
    }
}
