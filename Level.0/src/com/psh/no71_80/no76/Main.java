package com.psh.no71_80.no76;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int height = Integer.parseInt(br.readLine());
        System.out.println(solution(array, height));
    }

    static int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }
}
