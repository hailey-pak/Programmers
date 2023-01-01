package n120846_합성수찾기;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(solution(n));
    }

    static int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i ->
                (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
    }
}
