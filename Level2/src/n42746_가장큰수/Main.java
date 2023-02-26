package n42746_가장큰수;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(numbers));
    }

    static String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numbers[i] + "";
        }

        Arrays.sort(arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        if (sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}
