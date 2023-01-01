package n147355_크기가작은부분문자열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String p = sc.next();
        System.out.println(solution(t, p));
    }

    static int solution(String t, String p) {
        int cnt = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            int n = p.compareTo(t.substring(i, i + p.length()));
            if (n >= 0) cnt++;
        }
        return cnt;
    }
}
