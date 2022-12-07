package n12954_x만큼간격이있는n개의숫자;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(Arrays.toString(solution(x, n)));
    }

    static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long val = x;
        for (int i = 0; i < n; i++) {
            answer[i] = val;
            val += x;
        }
        return answer;
    }
}
