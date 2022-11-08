package com.psh.no41_50.no41;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] box = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        System.out.print(solution(box, n));
    }

    static int solution(int[] box, int n) {
        return (box[0]/n) * (box[1]/n) * (box[2]/n);
    }
}
