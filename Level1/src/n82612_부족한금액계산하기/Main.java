package n82612_부족한금액계산하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    static long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;
        }
        return money >= sum ? 0 : sum - money;
    }
}
