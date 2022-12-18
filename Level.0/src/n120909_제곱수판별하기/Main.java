package n120909_제곱수판별하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}
