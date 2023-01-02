package n12909_올바른괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(solution(s) ? "true" : "false");
    }

    static boolean solution(String s) {
        if (s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);

            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
