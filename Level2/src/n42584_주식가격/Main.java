package n42584_주식가격;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] prices = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(prices)));
    }

    static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) {
                   break;
                }
            }
        }
        return answer;
    }
}
