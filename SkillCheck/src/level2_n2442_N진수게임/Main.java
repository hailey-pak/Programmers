package level2_n2442_N진수게임;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        System.out.println(solution(n, t, m, p));
    }

    static String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        sb.append(0);   //처음은 무조건 0으로 시작
        int i = 1;

        while (sb.length() < m * t) {
            sb.append(convert(i++, n));
        }

        for (int j = p-1; j < m * (t-1) + p; j+=m) {
            answer.append(sb.charAt(j));
        }
        return answer.toString();
    }

    static String convert(int i, int n) {
        StringBuilder sb = new StringBuilder();
        while (i != 0) {
            if (i % n < 10) {
                sb.insert(0, i % n);
            } else {
                sb.insert(0, (char) (i % n + 55));
            }
            i /= n;
        }
        return sb.toString();
    }
}
