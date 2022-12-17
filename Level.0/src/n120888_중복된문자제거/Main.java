package n120888_중복된문자제거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        System.out.println(solution(my_string));
    }

    static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.charAt(0));
        for (int i = 1; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (!sb.toString().contains(c+"")) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}
