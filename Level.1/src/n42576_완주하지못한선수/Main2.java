package n42576_완주하지못한선수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] participant = br.readLine().split(" ");
        String[] completion = br.readLine().split(" ");
        System.out.println(solution(participant, completion));

    }

    static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String part : participant) map.put(part, map.getOrDefault(part, 0) + 1);
        for (String com : completion) map.put(com, map.get(com) - 1);

        String ans = "";
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) ans = entry.getKey();
        }
        return ans;
    }
}
