package n12940_최대공약수와최소공배수;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Arrays.toString(solution(n, m)));
    }

    static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int a = n, b = m;
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        answer[0] = a;
        answer[1] = n * m / a;

        return answer;
    }
}
