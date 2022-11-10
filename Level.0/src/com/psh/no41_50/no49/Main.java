package com.psh.no41_50.no49;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.print(solution(s));
    }

    static int solution(String s) {
        String[] arr = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String a : arr) {
            if (a.equals("Z")) {
                if (list.size() > 0) list.remove(list.size()-1);
            } else {
                list.add(Integer.parseInt(a));
            }
        }
        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        return sum;
    }
}
