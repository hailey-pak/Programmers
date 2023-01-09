package n12985_예상대진표;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(n, a, b));
    }

    static int solution(int n, int a, int b) {
        int r = 0;

        while (n != 1) {
            r++;
            n >>= 1;
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;

            if (a==b) break;
        }
        return r;
    }
}
