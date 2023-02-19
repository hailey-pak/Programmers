package n17679_프렌즈4블록;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String[] board = br.readLine().replaceAll("\"", "").replaceAll(" ", "").split(",");

        System.out.println(solution(m, n, board));
    }

    static int solution(int m, int n, String[] board) {
        arr = new char[m][n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = board[i].toCharArray();
        }

        int answer = 0;
        while (true) {
            int cnt = checkBlock(m, n);

            if (cnt == 0) break;
            answer += cnt;
        }
        return answer;
    }

    static int checkBlock(int m, int n) {
        boolean[][] b = new boolean[m][n];
        int cnt = 0;

        //블럭 확인
        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[i][j] == '0') continue;
                if (isFour(i, j)) {
                    b[i][j] = true;
                    b[i][j+1] = true;
                    b[i+1][j] = true;
                    b[i+1][j+1] = true;
                }
            }
        }

        //블럭 재배치
        for (int i = 0; i < n; i++) {
            ArrayList<Character> list = new ArrayList<>();
            for (int j = m-1; j >= 0; j--) {
                if (b[j][i]) {
                    cnt++;
                    continue;
                }
                list.add(arr[j][i]);
            }

            for (int j = m-1, k = 0; j >= 0; j--, k++) {
                if (k < list.size()) {
                    arr[j][i] = list.get(k);
                } else {
                    arr[j][i] = '0';
                }
            }
        }

        return cnt;
    }

    static boolean isFour(int i, int j) {
        char c = arr[i][j];

        return arr[i][j + 1] == c && arr[i + 1][j] == c && arr[i + 1][j + 1] == c;
    }
}
