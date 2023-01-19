package n64065_튜플;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(Arrays.toString(solution(s)));
    }

    static int[] solution(String s) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ',') {
                if (sb.length() != 0) {
                    sub.add(Integer.parseInt(sb.toString()));
                    sb.delete(0, sb.length());
                }
            }
            else if (c == '}') {
                if (sb.length() != 0) sub.add(Integer.parseInt(sb.toString()));
                if (sub.size() != 0) list.add(sub);

                sub = new ArrayList<>();
                sb.delete(0, sb.length());
            }
            else if (Character.isDigit(c)){
                sb.append(c);
            }
        }

        list.sort(Comparator.comparingInt(List::size));

        HashSet<Integer> set = new HashSet<>();
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            for (int n : list.get(i)) {
                if (set.add(n)) {
                    answer[i] = n;
                    break;
                }
            }
        }

        return answer;
    }

}
