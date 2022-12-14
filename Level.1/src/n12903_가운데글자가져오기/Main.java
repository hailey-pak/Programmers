package n12903_가운데글자가져오기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        System.out.println(solution(s));
    }

    static String solution(String s) {
        int idx = s.length() / 2;
        if (s.length() % 2 != 0) {
            return s.substring(idx, idx + 1);
        } else {
            return s.substring(idx - 1, idx + 1);
        }
    }
}

