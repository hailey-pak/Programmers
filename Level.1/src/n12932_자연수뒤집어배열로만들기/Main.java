package n12932_자연수뒤집어배열로만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        System.out.println(Arrays.toString(solution(n)));
    }

    static int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            int i = (int) (n % 10);
            list.add(i);
            n /= 10;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
