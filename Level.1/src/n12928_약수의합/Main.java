package n12928_약수의합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum+= i;
                if (i != n/i) {
                    sum+= n / i;
                }
            }
        }
        return sum;
    }
}
