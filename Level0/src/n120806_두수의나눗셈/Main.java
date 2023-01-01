package n120806_두수의나눗셈;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = solution(sc.nextInt(), sc.nextInt());
        System.out.println(answer);
    }

    static int solution(int num1, int num2) {
        double d = (double) num1 / num2;
        return (int) (d * 1000);
    }
}
