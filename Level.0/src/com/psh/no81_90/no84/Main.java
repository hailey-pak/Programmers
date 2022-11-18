package com.psh.no81_90.no84;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] spell = br.readLine().split(" ");
        String[] dic = br.readLine().split(" ");
        System.out.println(solution(spell, dic));
    }

    static int solution(String[] spell, String[] dic) {
        makeWords("", String.join("", spell));

        for (String s : set) {
            if (Arrays.asList(dic).contains(s)) return 1;
        }
        return 2;
    }

    static void makeWords(String prefix, String s){
        int n = s.length();
        if (n == 0) {
            set.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                makeWords(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1));
            }
        }
    }

}
