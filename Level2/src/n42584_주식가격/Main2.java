package n42584_주식가격;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] prices = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(prices)));
    }

    static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1 ;
            stack.pop();
        }

        return answer;
    }
}
