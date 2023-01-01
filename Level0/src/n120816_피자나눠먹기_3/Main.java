package n120816_피자나눠먹기_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int slice = new Scanner(System.in).nextInt();
        int n = new Scanner(System.in).nextInt();
        System.out.print(solution(slice, n));
    }

    static int solution(int slice, int n) {
        return n % slice == 0 ?  n / slice : n / slice + 1;
    }
}
