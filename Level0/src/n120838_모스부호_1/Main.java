package n120838_모스부호_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String letter = br.readLine();
        System.out.print(solution(letter));
    }

    static String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] str = letter.split(" ");
        for (String s : str) {
            int idx = Arrays.asList(morse).indexOf(s);
            sb.append(Character.toString(idx + 97));
        }
        return sb.toString();
    }
}
