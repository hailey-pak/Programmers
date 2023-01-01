package n12937_짝수와홀수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        System.out.println(solution(num));
    }

    static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
