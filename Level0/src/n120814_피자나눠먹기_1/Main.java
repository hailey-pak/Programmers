package n120814_피자나눠먹기_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(solution(n));
    }

    static int solution(int n) {
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }
}
