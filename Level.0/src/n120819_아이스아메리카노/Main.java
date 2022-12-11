package n120819_아이스아메리카노;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int money = new Scanner(System.in).nextInt();
        System.out.print(Arrays.toString(solution(money)));
    }

    static int[] solution(int money) {
        return new int[]{money / 5500, money % 5500};
    }
}
