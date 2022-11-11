package com.psh.no51_60.no56;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        String my_string = new Scanner(System.in).nextLine();
        System.out.println(solution(my_string));
    }

    static String solution(String my_string) {
        return my_string.chars().mapToObj(c ->
                String.valueOf((char) (Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c)))).
                collect(Collectors.joining());
    }
}
