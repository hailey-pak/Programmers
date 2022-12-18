package n120864_숨어있는숫자의덧셈_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String my_string = new Scanner(System.in).nextLine();
        System.out.println(solution(my_string));
    }

    static int solution(String my_string) {
        int sum = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                s.append(c);
            } else {
                if (s.toString().trim().length() != 0) {
                    sum += Integer.parseInt(s.toString());
                    s = new StringBuilder();
                }
            }
        }
        if (s.toString().trim().length() != 0) {
            sum += Integer.parseInt(s.toString());
        }
        return sum;
    }
}
