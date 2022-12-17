package n120848_팩토리얼;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(solution(n));
    }

    static int solution(int n) {
        int idx = 1;
        while (true) {
            int val = factorial(idx);
            if (val == n) return idx;
            if (val > n) return idx-1;
            idx++;
        }
    }

    static int factorial (int num) {
        if (num == 1)
            return 1;

        return num * factorial ( num - 1 );
    }

}

