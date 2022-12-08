package n12977_소수만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(nums));
    }

    static int solution(int[] nums) {
        int n = 1000 + 999 + 998;
        boolean[] notPrime = new boolean[n+1];     //1000이하의 자연수의 합이니까 1000+999+998 한 값에 인덱스라서 +1

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!notPrime[i]) {
                for (int j = 2; j * i <= n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (!notPrime[nums[i] + nums[j] + nums[k]]) cnt++;
                }
            }
        }
        return cnt;
    }

}
