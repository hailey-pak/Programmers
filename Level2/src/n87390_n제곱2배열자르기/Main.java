package n87390_n제곱2배열자르기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left = sc.nextInt();
        int right = sc.nextInt();
        System.out.println(Arrays.toString(solution(n, left, right)));
    }

    static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left +1)];

        int idx = 0;
        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;
            answer[idx++] = Math.max((int)row, (int)col) + 1;
        }

        return answer;
    }
}
