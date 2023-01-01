package n142086_가장가까운같은글자;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(Arrays.toString(solution(s)));
    }

    static int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = -1;
            for (int j = i-1; j >= 0; j--) {
                char before = s.charAt(j);
                if (before == c) {
                    idx = i - j;
                    break;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}
