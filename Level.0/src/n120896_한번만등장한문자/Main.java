package n120896_한번만등장한문자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }

    static String solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String val = s.charAt(i)+"";
            if (map.containsKey(val)) {
                map.put(val, map.get(val)+1);
            } else {
                map.put(val, 1);
            }
        }

        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key)==1) list.add(key);
        }
        Collections.sort(list);

        return String.join("", list);
    }
}
