package n42842_카펫;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brown = sc.nextInt();
        int yellow = sc.nextInt();
        System.out.println(Arrays.toString(solution(brown, yellow)));
    }

    static int[] solution(int brown, int yellow) {
        int[] answer = {};
        int all = brown + yellow;

        for (int i = 1; i <= Math.sqrt(all); i++) {
            if (all % i == 0) {
                int j = all / i ;
                if (i * 2 + j * 2 - 4 == brown) {
                    if ((i - 2) * (j - 2) == yellow) {
                        answer = new int[]{j, i};
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
