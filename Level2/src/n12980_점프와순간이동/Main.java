package n12980_점프와순간이동;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int cnt = 0;
        while (n != 0) {
            if (n % 2 != 0) {
                cnt++;
                n--;
            } else {
                n /= 2;
            }
        }
        return cnt;
    }
}
