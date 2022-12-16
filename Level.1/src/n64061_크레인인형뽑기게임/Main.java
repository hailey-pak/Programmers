package n64061_크레인인형뽑기게임;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n][];
        for (int i = 0; i < n; i++) {
            board[i] = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        }
        int[] moves = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(board, moves));
    }

    static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();

        int cnt = 0;
        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                int n = board[i][m-1];
                if (n != 0) {
                    if (!stack.empty() && stack.peek()==n) {
                        stack.pop();
                        cnt += 2;
                    } else {
                        stack.push(n);
                    }
                    board[i][m-1] = 0;
                    break;
                }
            }
        }
        return cnt;
    }
}
