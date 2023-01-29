package n12905_가장큰정사각형찾기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // [0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.substring(1, str.length()-1);
        String[] arr = str.split("],\\[");

        int[][] board = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            board[i] = Arrays.stream(arr[i].split(",")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println(solution(board));
    }

    static int solution(int [][]board) {
        int answer = 0;
        int row = board.length;
        int col = board[0].length;

        if (row < 2 || col < 2) {
            return 1;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = Math.min(board[i-1][j-1], Math.min(board[i-1][j], board[i][j-1])) + 1;
                }
                if (answer < board[i][j]) answer = board[i][j];
            }
        }

        return answer * answer;
    }
}
