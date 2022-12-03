package n12932_자연수뒤집어배열로만들기;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        System.out.println(Arrays.toString(solution(n)));
    }

    static int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}
