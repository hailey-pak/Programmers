package n120924_다음에올숫자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] common = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(common));
    }

    static int solution(int[] common) {
        int a = common[1]-common[0];
        int b = common[2]-common[1];

        if (a == b) {
            return common[common.length-1] + a;
        } else {
            return common[common.length-1] * (common[1]/common[0]);
        }
    }
}
