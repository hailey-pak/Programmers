package n12918_문자열다루기기본;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
