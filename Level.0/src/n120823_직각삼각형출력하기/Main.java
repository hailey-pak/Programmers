package n120823_직각삼각형출력하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i < n + 1; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
