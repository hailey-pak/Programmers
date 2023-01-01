package n87389_나머지가1이되는수찾기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int ans = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
