package n131127_할인행사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] want = br.readLine().replaceAll("\"", "").split(", ");
        int[] number = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        String[] discount = br.readLine().replaceAll("\"", "").split(", ");
        System.out.println(solution(want, number, discount));
    }

    static int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        int cnt = 0;
        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> tmp = new HashMap<>();
            boolean done = true;

            for (int j = i; j < i + 10; j++) {
                if (map.containsKey(discount[j])) {
                    tmp.put(discount[j], tmp.getOrDefault(discount[j], 0) + 1);
                } else {
                    done = false;
                    break;
                }
            }
            //두 map 비교
            if (done && map.equals(tmp)) {
                cnt++;
            }
        }

        return cnt;
    }
}
