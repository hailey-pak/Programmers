package n120815_피자나눠먹기_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(solution(n));
    }

    static int solution(int n) {
        int gcd = gcd(n);
        return n / gcd;
    }

    static int gcd(int a) {
        int b = 6;
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
