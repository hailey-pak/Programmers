package n76502_괄호회전하기;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(solution(s));
    }

    static int solution(String s) {
        int ans = 0;
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            String sub = sb.substring(0, 1);
            sb.delete(0, 1);
            sb.append(sub);

            if (check(sb.toString())) {
                ans++;
            }
        }
        return ans;
    }

    static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            switch (c) {
                case '[' :
                case '{' :
                case '(' :
                    stack.add(c);
                    break;
                case ']':
                    if (stack.empty() || stack.peek() != '[') return false;
                    stack.pop();
                    break;
                case '}':
                    if (stack.empty() || stack.peek() != '{') return false;
                    stack.pop();
                    break;
                case ')':
                    if (stack.empty() || stack.peek() != '(') return false;
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }
}
