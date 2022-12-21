
package n68935_3진법뒤집기;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            sb.append(n % 3);
            n = n / 3;
        }

        String s = sb.toString();
        return Integer.parseInt(s, 3);
    }
}
