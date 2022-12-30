package n12939_최댓값과최솟값;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(solution(s));
    }

    static String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for (String str : arr) {
            int i = Integer.parseInt(str);
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return min + " " + max;
    }
}
