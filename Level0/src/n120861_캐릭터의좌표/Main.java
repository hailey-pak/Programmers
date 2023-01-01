package n120861_캐릭터의좌표;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] key = br.readLine().split(" ");
        int[] board = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(key, board)));
    }

    static int[] solution(String[] key, int[] board) {
        int[] answer = new int[] {0, 0};
        int maxW = board[0] / 2;
        int maxH = board[1] / 2;

        for (String s : key) {
            switch (s) {
                case "up":
                    answer[1] = answer[1] + 1 <= maxH ? answer[1] + 1 : answer[1];
                    break;
                case "down":
                    answer[1] = answer[1] - 1 >= maxH * -1 ? answer[1] - 1 : answer[1];
                    break;
                case "left":
                    answer[0] = answer[0] - 1 >= maxW * -1 ? answer[0] - 1 : answer[0];
                    break;
                case "right":
                    answer[0] = answer[0] + 1 <= maxW ? answer[0] + 1 : answer[0];
                    break;
            }
        }
        return answer;
    }
}
