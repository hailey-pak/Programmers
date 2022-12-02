package n12922_수박수박수박수박수박수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        return sb.toString();
    }
}
