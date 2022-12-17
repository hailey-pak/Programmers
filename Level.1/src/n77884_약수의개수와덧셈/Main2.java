package n77884_약수의개수와덧셈;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        System.out.println(solution(left, right));
        sc.close();
    }

    static int solution(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            //제곱수이면 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                ans -= i;
            } else {
                ans += i;
            }
        }
        return ans;
    }
}
