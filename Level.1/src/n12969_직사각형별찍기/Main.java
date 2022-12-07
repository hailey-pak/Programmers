package n12969_직사각형별찍기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String s = "*";
        for (int i = 0; i < m; i++) {
            System.out.println(s.repeat(n));
        }
    }
}
