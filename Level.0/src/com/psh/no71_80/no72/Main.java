package com.psh.no71_80.no72;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String my_string = new Scanner(System.in).nextLine();
        System.out.println(solution(my_string));
    }

    static String solution(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }
}
