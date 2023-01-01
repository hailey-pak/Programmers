package n42862_체육복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] lost = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] reserve = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(n, lost, reserve));
    }

    static int solution(int n, int[] lost, int[] reserve) {
        int[] all = new int[n+2];
        for (int i : lost) all[i]--;
        for (int i : reserve) all[i]++;

        int cnt = n;
        for (int i = 1; i <= n; i++) {
            if (all[i] == -1) {
                if (all[i-1] > 0) {
                    all[i]++;
                    all[i-1]--;
                } else if (all[i+1] > 0) {
                    all[i]++;
                    all[i+1]--;
                } else {
                    cnt--;
                }
            }
        }
        return cnt;
    }
}
