package n12934_정수제곱근판별;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        System.out.println(solution(n));
    }

    static long solution(long n) {
        double d = Math.sqrt(n);
        return d % 1 == 0 ? (long) Math.pow(d + 1, 2) : -1;
    }
}
