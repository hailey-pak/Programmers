package n140108_문자열나누기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }

    static int solution(String s) {
        int n = 0, cnt1 = 0, cnt2 = 0;
        char x = ' ';

        for (int i = 0; i < s.length(); i++) {
            if (cnt1 == 0 && cnt2 == 0) {
                x = s.charAt(i);
            }
            if (x == s.charAt(i)) {
                cnt1++;
            } else {
                cnt2++;
            }
            if (cnt1 == cnt2) {
                n++;
                cnt1 = cnt2 = 0;
            }
        }
        if (cnt1 != 0)  n++;
        return n;
    }
}
