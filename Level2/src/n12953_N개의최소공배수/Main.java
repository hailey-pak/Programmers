package n12953_N개의최소공배수;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(arr));
    }

    static int solution(int[] arr) {
        int lcm = 1;
        for (int a : arr) {
            lcm = a * lcm / gdc(a, lcm);
        }
        return lcm;
    }

    static int gdc(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
