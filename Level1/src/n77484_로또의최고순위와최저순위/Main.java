package n77484_로또의최고순위와최저순위;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] lotto = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] win_nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(lotto, win_nums)));
    }

    static int[] solution(int[] lotto, int[] win_nums) {
        int min = 7;            //등수 + 번호 일치 개수 = 7 --> 등수 = 7 - 번호 일치 개수
        int zero = 0;
        for (int i : lotto) {
            if (i == 0) {
                zero++;
                continue;
            }
            for (int w : win_nums) {
                if (i == w) {
                    min --;
                    break;
                }
            }
        }

        int max = min - zero;

        //맞는 번호가 하나도 없는 경우는 2가지로 나뉨
        //1. zero가 존재해서 zero의 수가 맞춘 개수가 되는 경우 / 2. zero가 0개 이고 로또 숫자가 모두 틀린경우
        if (min == 7) {
            min = 6;
            if (zero == 0) {
                max = 6;
            }
        }

        return new int[]{max, min};
    }
}
