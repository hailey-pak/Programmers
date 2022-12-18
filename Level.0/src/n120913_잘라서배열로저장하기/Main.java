package n120913_잘라서배열로저장하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(my_str, n)));
    }

    static String[] solution(String my_str, int n) {
        int len = my_str.length();
        String[] answer = new String[len % n == 0 ? len / n : len / n + 1];

        int s = 0, e = n;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_str.substring(s, e);
            s = e;
            e += n;
            if (e > len) e = len;
        }
        return answer;
    }
}
