package n12943_콜라츠추측;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        System.out.println(solution(num));
    }

    static int solution(int num) {
        if (num == 1) return 0;
        long n = num;

        for (int i = 0; i < 500; i++) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            if (n == 1) return i + 1;
        }
        return -1;
    }
}
