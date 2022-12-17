package n120840_구슬을나누는경우의수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balls = sc.nextInt();
        int share = sc.nextInt();
        System.out.print(solution(balls, share));
    }

    static int solution(int balls, int share) {
        return combi(balls, share);
    }

    static int combi(int n, int r) {
        if (r == 0 || r == n) return 1;
        return combi(n-1, r-1) + combi(n-1, r);
    }
}
