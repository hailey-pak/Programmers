package n12948_핸드폰번호가리기;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String phone_number = new Scanner(System.in).nextLine();
        System.out.println(solution(phone_number));
    }

    static String solution(String phone_number) {
        char[] arr = phone_number.toCharArray();
        for (int i = 0; i < arr.length-4; i++) {
            arr[i] = '*';
        }
        return String.valueOf(arr);
    }
}
