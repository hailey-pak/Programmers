package n12948_핸드폰번호가리기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String phone_number = new Scanner(System.in).nextLine();
        System.out.println(solution(phone_number));
    }

    static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phone_number.length()-4; i++) {
            sb.append("*");
        }
        sb.append(phone_number.substring(phone_number.length()-4));
        return sb.toString();
    }
}
