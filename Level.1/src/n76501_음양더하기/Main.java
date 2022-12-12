package n76501_음양더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] absolutes = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

        String[] str = br.readLine().split(",");
        boolean[] signs = new boolean[str.length];
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("true")) {
                signs[i] = true;
            }
        }

        System.out.println(solution(absolutes, signs));
    }

    static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                sum += absolutes[i];
            } else {
                sum -= absolutes[i];
            }
        }
        return sum;
    }
}
