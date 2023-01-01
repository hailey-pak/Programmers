package n12925_문자열을정수로바꾸기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        System.out.println(solution(s));
    }

    static int solution(String s) {
        return Integer.parseInt(s);
    }
}
