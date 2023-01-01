package n120834_외계행성의나이;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();
        System.out.print(solution(age));
    }

    static String solution(int age) {
        String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        StringBuilder sb = new StringBuilder();
        while (age > 0) {
            sb.append(str[age % 10]);
            age /= 10;
        }
        return sb.reverse().toString();
    }
}
