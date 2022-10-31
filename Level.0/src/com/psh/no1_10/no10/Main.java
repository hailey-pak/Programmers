package com.psh.no1_10.no10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] array = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        System.out.print(solution(array));
    }

    static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}
