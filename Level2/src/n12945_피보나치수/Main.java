package n12945_피보나치수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n ; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 1234567;
        }

        return arr[n];
    }
}
