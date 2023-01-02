package n12951_JadenCase문자열만들기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(solution(s));
    }

    static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        boolean isFirst = true;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(" ");
                isFirst = true;
            } else if (Character.isDigit(c)) {
                sb.append(c);
                isFirst = false;
            } else {
                if (isFirst) {
                    sb.append(String.valueOf(c).toUpperCase());
                    isFirst = false;
                } else {
                    sb.append(String.valueOf(c).toLowerCase());
                }
            }
        }

        return sb.toString();
    }
}
