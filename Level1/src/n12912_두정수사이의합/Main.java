package n12912_두정수사이의합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a, b));
    }

    static long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}
