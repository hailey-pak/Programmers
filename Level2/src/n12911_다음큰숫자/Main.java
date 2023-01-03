package n12911_다음큰숫자;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int cnt = countOne(Integer.toBinaryString(n));

        int m = n + 1;
        while (true) {
            int tmp = countOne(Integer.toBinaryString(m));
            if (tmp == cnt) break;
            m++;
        }
        return m;
    }

    static int countOne(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') cnt++;
        }
        return cnt;
    }
}
