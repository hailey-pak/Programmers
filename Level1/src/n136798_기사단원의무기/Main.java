package n136798_기사단원의무기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int limit = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(solution(number, limit, power));
    }

    static int solution(int number, int limit, int power) {
        int[] arr = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                arr[i * j]++;
            }
        }

        int sum = 0;
        for (int i : arr) {
            if (i > limit) {
                sum += power;
            } else {
                sum += i;
            }
        }
        return sum;
    }
}
