package n131701_연속부분수열합의개수;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[] elements = Arrays.stream(new Scanner(System.in).nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(elements));
    }

    static int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = j; k < j+i; k++) {
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }

        return set.size();
    }
}
