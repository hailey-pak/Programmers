package com.psh.no61_70.no66;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numlist = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(n, numlist)));
    }

    static int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                list.add(num);
            }
        }
        return  list.stream().mapToInt(i->i).toArray();
    }
}
