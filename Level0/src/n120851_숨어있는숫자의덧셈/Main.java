package n120851_숨어있는숫자의덧셈;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String my_string = new Scanner(System.in).nextLine();
        System.out.println(solution(my_string));
    }

    static int solution(String my_string) {
        int sum = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if ( Character.isDigit(my_string.charAt(i))) {
                sum += my_string.charAt(i) - '0';
            }
        }
        return sum;
    }
}
