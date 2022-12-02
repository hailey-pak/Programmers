package n12921_소수찾기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        boolean[] arr = new boolean[n+1];           //인덱스와 숫자를 맞추기 위해 +1
        for (int i = 2; i <= Math.sqrt(n) ; i++) {  //n의 제곱수까지 진행
            if (!arr[i]) {                          //제일 작은 수부터 소수일경우(false)
                for (int j = 2; j * i <= n; j++) {  //n이하의 수 중 해당 수의 배수를 true로 바꾸기
                    arr[i * j] = true;
                }
            }
        }

        int answer = 0;
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) answer++;
        }
        return answer;
    }

}
