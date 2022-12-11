package n120804_두수의곱;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = solution(sc.nextInt(), sc.nextInt());
        System.out.println(answer);
    }

    static int solution(int num1, int num2) {
        return num1 * num2;
    }
}
