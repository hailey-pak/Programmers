package n132267_콜라문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(arr[0], arr[1], arr[2]));
    }

    static int solution(int a, int b, int n) {
        int cnt = 0;
        while (n >= a) {
            int i = (n / a) * b;
            cnt += i;
            n = (n % a) + i;
        }
        return cnt;
    }
}
