package n120583_중복된숫자개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(array, n));
    }

    static int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}
