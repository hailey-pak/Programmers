package n120824_짝수홀수개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] num_list = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(num_list)));
    }

    static int[] solution(int[] num_list) {
        int odd = 0, even = 0;
        for (int n : num_list)
            if (n % 2 == 0) even++;
            else odd++;
        return new int[]{even, odd};
    }
}
