package n120897_약수구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(Arrays.toString(solution(n)));
    }

    static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
