package n49993_스킬트리;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String skill = sc.nextLine();
        String[] skill_trees = sc.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(solution(skill, skill_trees));
    }

    static int solution(String skill, String[] skill_trees) {
        int ans = 0;

        for (String s : skill_trees) {
            boolean b = true;
            int n = -1;

            for (int i = 0; i < s.length(); i++) {
                String w = s.charAt(i) +"";

                int idx = skill.indexOf(w);
                if (idx > -1) {
                    n++;
                    if (idx > i || idx != n) {
                        b = false;
                        break;
                    }
                }
            }
            if (b) ans++;
        }

        return ans;
    }
}
