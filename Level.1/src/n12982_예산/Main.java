package n12982_예산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] d = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int budget = Integer.parseInt(br.readLine());
        System.out.println(solution(d, budget));
        br.close();
    }

    static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) return i;
            if (sum == budget) return i+1;
        }
        return d.length;
    }
}
