package n120808_분수의덧셈;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answer = solution(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(Arrays.toString(answer));
    }

    static int[] solution(int denum1, int num1, int denum2, int num2) {
        int fraction = denum1 * num2 + denum2 * num1;
        int numerator = num1 * num2;
        int mod = gcd(fraction, numerator);
        return new int[]{fraction/mod, numerator/mod};
    }

    static int gcd(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b == 0) return a;
        return gcd(b , a % b);
    }
}
