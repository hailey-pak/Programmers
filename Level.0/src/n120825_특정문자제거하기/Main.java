package n120825_특정문자제거하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        String letter = br.readLine();
        System.out.print(solution(my_string, letter));
    }

    static String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
}
