package n120878_유한소수판별하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a, b));
        sc.close();
    }

    static int solution(int a, int b) {
        int val = b / gcd(a, b);

        while (val != 1) {
            if (val % 2 == 0) {
                val /= 2;
            } else if (val % 5 == 0) {
                val /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
