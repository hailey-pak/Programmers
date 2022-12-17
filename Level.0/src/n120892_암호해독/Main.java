package n120892_암호해독;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cipher = br.readLine();
        int code = Integer.parseInt(br.readLine());
        System.out.print(solution(cipher, code));
    }

    static String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        for (int i = code; i <= cipher.length(); i += code) {
            sb.append(cipher.charAt(i-1));
        }
        return sb.toString();
    }
}
