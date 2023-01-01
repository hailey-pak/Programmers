package n120910_세균증식;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(solution(n, t));
    }

    static int solution(int n, int t) {
        int sum;
        sum = n << t;
        return sum;
    }
}
