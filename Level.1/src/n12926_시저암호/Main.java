package n12926_시저암호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(s, n));
    }

    static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 65 && c <= 90) {
                c += n;
                c = c > 90 ? (char) (c - 26) : c;
            }
            if (c >= 97 && c <= 122) {
                c += n;
                c = c > 122 ? (char) (c - 26) : c;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
