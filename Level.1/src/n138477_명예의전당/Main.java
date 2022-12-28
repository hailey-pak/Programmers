package n138477_명예의전당;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] score = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(k, score)));
    }

    static int[] solution(int k, int[] score) {
        int[] award = new int[k];
        int[] answer = new int[score.length];

        for (int i = 0; i < k; i++) {
            award[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                award[i] = score[i];
            } else if (Arrays.stream(award).min().getAsInt() <= score[i]) {
                award[0] = score[i];
            }
            Arrays.sort(award);
            answer[i] = award[0];
        }
        return answer;
    }
}
