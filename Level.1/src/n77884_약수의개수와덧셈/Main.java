package n77884_약수의개수와덧셈;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        System.out.println(solution(left, right));
        sc.close();
    }

    static int solution(int left, int right) {
        boolean[] arr = new boolean[right + 1];   //false -> 1,자신을 약수로 가짐 (짝수라고 가정)
        arr[1] = true;  //1은 자신만 약수로 가져서 약수 개수 홀수

        for (int i = 2; i <= right / 2; i++) {
            for (int j = 2; j * i <= right; j++) {
                arr[i * j] = !arr[i * j];   //배수를 반대 부호로 만들어줌
            }
        }

        int ans = 0;
        for (int i = left; i <= right; i++) {
            if (arr[i]) {
                ans -= i;
            } else {
                ans += i;
            }
        }
        return ans;
    }
}
