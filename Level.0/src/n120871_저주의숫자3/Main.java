package n120871_저주의숫자3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer++;
            while (String.valueOf(answer).contains("3") || answer % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}
