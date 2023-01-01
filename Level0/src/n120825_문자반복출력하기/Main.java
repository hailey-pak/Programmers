package n120825_문자반복출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(my_string, n));
    }

    static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            String s = String.valueOf(my_string.charAt(i));
            answer.append(s.repeat(n));
        }
        return answer.toString();
    }
}
