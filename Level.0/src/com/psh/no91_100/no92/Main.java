package com.psh.no91_100.no92;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] id_pw = br.readLine().split(" ");

        String[] str = br.readLine().split(", ");
        String[][] db = new String[3][2];
        for (int i = 0; i < 3; i++) {
            db[i] = str[i].split(" ");
        }
        System.out.println(solution(id_pw, db));
    }

    static String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> map = new HashMap<>();
        for (String[] str : db) {
            map.put(str[0], str[1]);
        }

        if (map.containsKey(id_pw[0])) {
            if (map.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            } else {
                return "wrong pw";
            }
        }
        return "fail";
    }
}
