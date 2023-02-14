package n12913_땅따먹기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[][] lend = new int[arr.length/4][4];

        for (int i = 0; i < lend.length; i++) {
            for (int j = 0; j < 4; j++) {
                lend[i][j] = Integer.parseInt(arr[i * 4 + j]);
            }
        }
        System.out.println(solution(lend));
    }

    static int solution(int[][] land) {

        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][1], land[i-1][0]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }

        int[] answer = land[land.length-1];
        return Math.max(answer[0], Math.max(answer[1], Math.max(answer[2], answer[3])));
    }
}
