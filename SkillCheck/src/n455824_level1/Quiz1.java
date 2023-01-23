package n455824_level1;

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static long solution(int n) {
        long sum = 0;

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                sum += n / i;
            }
        }
        if (n % Math.sqrt(n) == 0) {
            sum += Math.sqrt(n);
        }
        return sum;
    }
}
