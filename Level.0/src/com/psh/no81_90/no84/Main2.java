package com.psh.no81_90.no84;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] spell = br.readLine().split(" ");
        String[] dic = br.readLine().split(" ");
        System.out.println(solution(spell, dic));
    }

    static int solution(String[] spell, String[] dic) {
         for(String d : dic) {
            boolean isExist = true;
            for(String s : spell) {
                if(!d.contains(s)) {
                    isExist = false;
                    break;
                }
            }
            if (isExist) return 1;
        }
        return 2;
    }

}
