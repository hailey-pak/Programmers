package n135808_과일장수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] score = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(k, m, score));
    }

    static int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int sum = 0;
        for (int i = score.length - m; i >= 0; i -= m) {
            sum += score[i] * m;
        }
        return sum;
    }
}
