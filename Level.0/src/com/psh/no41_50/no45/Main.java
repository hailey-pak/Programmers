package com.psh.no41_50.no45;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String my_string = new Scanner(System.in).nextLine();
        System.out.println(solution(my_string));
    }

    static String solution(String my_string) {
        my_string = my_string.replaceAll("a", "");
        my_string =  my_string.replaceAll("e", "");
        my_string =  my_string.replaceAll("i", "");
        my_string =  my_string.replaceAll("o", "");
        my_string =  my_string.replaceAll("u", "");
        return my_string;
    }
}
