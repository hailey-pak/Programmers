package n120885_이진수더하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin1 = sc.nextLine();
        String bin2 = sc.nextLine();
        System.out.println(solution(bin1, bin2));
    }

    static String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}
