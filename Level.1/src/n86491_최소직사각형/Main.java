package n86491_최소직사각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] sizes = new int[n][2];

        for (int i = 0; i < n; i++) {
            sizes[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(solution(sizes));
    }

    static int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];

            if (w < h) {
                sizes[i][0] = h;
                sizes[i][1] = w;
            }
        }

        int maxW = 0, maxH = 0;
        for (int[] size : sizes) {
            if (size[0] > maxW) maxW = size[0];
            if (size[1] > maxH) maxH = size[1];
        }
        return maxW * maxH;
    }
}
