package n81301_숫자문자열과영단어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }

    static int solution(String s) {
        String[] letter = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < letter.length; i++) {
           s = s.replaceAll(letter[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

}
