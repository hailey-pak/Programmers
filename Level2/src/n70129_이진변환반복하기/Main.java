package n70129_이진변환반복하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(Arrays.toString(solution(s)));
    }

    static int[] solution(String s) {
        int sum = 0;
        int cnt = 0;

        while (!s.equals("1")) {
            for (char c : s.toCharArray()) {
                if (c == '0') sum++;
            }
            s = s.replaceAll("0", "");
            int n = s.length();
            s = Integer.toBinaryString(n);
            cnt++;
        }

        return new int[]{cnt, sum};
    }
}
