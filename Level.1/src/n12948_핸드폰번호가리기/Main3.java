package n12948_핸드폰번호가리기;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String phone_number = new Scanner(System.in).nextLine();
        System.out.println(solution(phone_number));
    }

    static String solution(String phone_number) {
        return "*".repeat(Math.max(0, phone_number.length() - 4)) +
                phone_number.substring(phone_number.length() - 4);
    }
}
