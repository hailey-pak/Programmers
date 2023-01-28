package n17684_압축;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String msg = new Scanner(System.in).nextLine();
        System.out.println(Arrays.toString(solution(msg)));
    }

    static int[] solution(String msg) {
        HashMap<String, Integer> map = new HashMap<>();

        char c = 'A';
        for (int i = 1; i <= 26; i++) {
            map.put(c+"", i);
            c++;
        }

        Queue<String> queue = new LinkedList<>();
        for (char m : msg.toCharArray()) {
            queue.add(m+"");
        }

        ArrayList<Integer> result = new ArrayList<>();

        String word = "";
        while (!queue.isEmpty() || !"".equals(word)) {

            if (map.containsKey(word + queue.peek())) {
                word += queue.poll();
                continue;
            }

            map.put(word + queue.peek(), map.size()+1);
            result.add(map.get(word));
            word = "";
        }


        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
