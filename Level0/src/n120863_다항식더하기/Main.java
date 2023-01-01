package n120863_다항식더하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String polynomial = new Scanner(System.in).nextLine();
        System.out.println(solution(polynomial));
    }

    static String solution(String polynomial) {
        String[] str = polynomial.split(" ");
        int x = 0, y = 0;
        for (String s : str) {
            if (s.contains("+")) continue;
            if (s.contains("x")) {
                int n = s.equals("x") ? 1 : Integer.parseInt(s.substring(0, s.length() - 1));
                x += n;
            } else {
                y += Integer.parseInt(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (x != 0) {
            if (x != 1) sb.append(x);
            sb.append("x");
            if (y != 0) sb.append(" + ").append(y);
        } else {
            sb.append(y);
        }
        return sb.toString();
    }
}
