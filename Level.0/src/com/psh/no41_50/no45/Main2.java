package com.psh.no41_50.no45;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String my_string = new Scanner(System.in).nextLine();
        System.out.println(solution(my_string));
    }

    static String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
