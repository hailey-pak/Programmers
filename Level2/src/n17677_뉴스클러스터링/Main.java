package n17677_뉴스클러스터링;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(solution(str1, str2));
    }

    static int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < str1.length()-1; i++) {
            String s = str1.substring(i, i+2);
            if (s.matches("^[a-z]*$")) {
                list1.add(s);
            }
        }
        for (int i = 0; i < str2.length()-1; i++) {
            String s = str2.substring(i, i+2);
            if (s.matches("^[a-z]*$")) {
                list2.add(s);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        ArrayList<String> intersect = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();

        for (String s : list1) {
            if (list2.remove(s)) {
                intersect.add(s);
            }
            union.add(s);
        }
        union.addAll(list2);

        if (union.size() == 0) {
            return 65536;
        }

        double d = (double)intersect.size() / union.size();
        return (int) (d * 65536);
    }
}
