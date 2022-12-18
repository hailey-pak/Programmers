package n120886_A로B만들기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String before = sc.nextLine();
        String after = sc.nextLine();
        System.out.println(solution(before, after));
    }

    static int solution(String before, String after) {
        for (int i = 0; i < before.length(); i++) {
            after = after.replaceFirst(before.charAt(i)+"", "");
        }
        return after.trim().length() == 0 ? 1 : 0;
    }
}
