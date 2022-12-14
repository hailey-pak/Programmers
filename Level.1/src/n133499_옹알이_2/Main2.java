package n133499_옹알이_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] babbling = br.readLine().split(" ");
        System.out.println(solution(babbling));
    }

    static int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};
        String[] none = {"ayaaya", "yeye", "woowoo", "mama"};
        int cnt = 0;

        for (String b : babbling) {
            boolean valid = true;
            for (String n : none) {
                if (b.contains(n)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                for (String a : arr) {
                    b = b.replace(a, " ");
                }
                if (b.trim().length() == 0) cnt++;
            }
        }
        return cnt;
    }
}
