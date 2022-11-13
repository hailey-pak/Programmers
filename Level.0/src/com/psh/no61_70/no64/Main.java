package com.psh.no61_70.no64;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        System.out.println(solution(s1, s2));

    }

    static int solution(String[] s1, String[] s2) {
        List<String> l1 = new ArrayList<>(Arrays.asList(s1));
        List<String> l2 = new ArrayList<>(Arrays.asList(s2));
        l1.retainAll(l2);
        return l1.size();
    }
}
