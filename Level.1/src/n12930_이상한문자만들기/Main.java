package n12930_이상한문자만들기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(solution(s));
    }

    static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (char c : s.toCharArray()) {
            if (c == 32) {
                sb.append(c);
                n = 0;
            } else {
                if (n % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                n++;
            }
        }
        return sb.toString();
    }
}
