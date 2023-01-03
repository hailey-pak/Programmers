package n12924_숫자의표현;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int cnt = 1;
        for (int i = 1; i <= n/2; i++) {
            int sum = 0;
            for (int j = i; j <= n/2 + 1; j++) {
                sum += j;
                if (sum == n) {
                    cnt ++;
                }
                if (sum >= n) {
                    break;
                }
            }
        }
        return cnt;
    }
}
