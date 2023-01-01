package n12947_하샤드수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        System.out.println(solution(x));
    }

    static boolean solution(int x) {
        int sum = 0;
        int n = x;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return x % sum == 0;
    }
}
