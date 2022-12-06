package n12950_행렬의덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] arr1 = new int[2][];
        int[][] arr2 = new int[2][];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        arr1[0] = Arrays.stream(st.nextToken().split(",")).mapToInt(Integer::parseInt).toArray();
        arr1[1] = Arrays.stream(st.nextToken().split(",")).mapToInt(Integer::parseInt).toArray();

        st = new StringTokenizer(br.readLine());
        arr2[0] = Arrays.stream(st.nextToken().split(",")).mapToInt(Integer::parseInt).toArray();
        arr2[1] = Arrays.stream(st.nextToken().split(",")).mapToInt(Integer::parseInt).toArray();

        int[][] ans = solution(arr1, arr2);
        for (int[] arr : ans) {
            System.out.println(Arrays.toString(arr));
        }
    }

    static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
