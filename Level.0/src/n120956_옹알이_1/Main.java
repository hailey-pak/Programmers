package n120956_옹알이_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] babbling = br.readLine().split(" ");
        System.out.println(solution(babbling));
    }

    static int solution(String[] babbling) {
        String[] word = new String[] {"aya", "ye", "woo", "ma"};

        int cnt = 0;
        for (String bab : babbling) {
            for (String w : word) {
                bab = bab.replace(w, " ");
            }
            if (bab.trim().length() == 0) cnt++;
        }
        return cnt;
    }
}
