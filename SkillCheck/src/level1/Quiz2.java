package level1;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int[] arr = Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(arr));
    }

    static double solution(int[] arr) {
        double answer = 0;
        for (int a : arr) {
            answer += a;
        }
        return answer / arr.length;
    }
}
