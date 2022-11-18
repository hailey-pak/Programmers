package com.psh.no81_90.no81;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String my_string = new Scanner(System.in).nextLine();
        System.out.println(solution(my_string));
    }

    static int solution(String my_string) {
        int sum = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for (String s: str) {
            if (!s.equals("")) sum += Integer.parseInt(s);
        }
        return sum;
    }
}
