package n1829_카카오프렌즈컬러링북;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    static boolean[][] visited;
    static int[][] arr;
    static int cnt;

    public static void main(String[] args) throws IOException {
        //예제
        int m = 6;
        int n = 4;
        int[][] picture = new int[][]{
          //      {1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}
                {1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}
        };
        System.out.println(Arrays.toString(solution(m, n, picture)));
    }

    static int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        visited = new boolean[m][n];
        arr = picture.clone();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (!visited[i][j]) {
                    visited[i][j] = true;
                    int k = arr[i][j];

                    if (k != 0) {
                        answer[0]++;
                        cnt = 1;
                        search(k, i, j);
                        answer[1] = Math.max(answer[1], cnt);
                    }

                }
            }
        }

        return answer;
    }

    static void search(int k, int i, int j) {
        int m = arr.length;
        int n = arr[0].length;

        if (i + 1 < m) {
            if (!visited[i+1][j] && arr[i+1][j] == k) {
                visited[i+1][j] = true;
                cnt++;
                search(k, i+1, j);
            }
        }

        if (j + 1 < n) {
            if (!visited[i][j+1] && arr[i][j+1] == k) {
                visited[i][j+1] = true;
                cnt++;
                search(k, i, j+1);
            }
        }
    }
}
