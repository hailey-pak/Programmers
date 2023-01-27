package n131701_연속부분수열합의개수;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] elements = Arrays.stream(new Scanner(System.in).nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(elements));
    }

    static int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();

        int[] arr = new int[elements.length*2];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
            arr[i + elements.length] = elements[i];
        }

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int n = 0;
                for (int k = j; k < j+i+1; k++) {
                    n += arr[k];
                }
                set.add(n);
            }
        }

        return set.size();
    }
}
