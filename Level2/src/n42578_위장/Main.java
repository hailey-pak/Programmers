package n42578_위장;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[][] clothes = new String[][]{
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        System.out.println(solution(clothes));
    }

    static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] str : clothes) {
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
        }

        int ans = 1;
        for (String key : map.keySet()) {
            ans *= map.get(key) + 1;
        }

        return ans - 1;
    }
}
