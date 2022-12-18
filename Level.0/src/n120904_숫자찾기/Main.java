package n120904_숫자찾기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(num, k));
    }

    static int solution(int num, int k) {
        String str = String.valueOf(num);
        int idx = str.indexOf(k+"");
        return idx == -1 ? idx : idx + 1;
    }
}
