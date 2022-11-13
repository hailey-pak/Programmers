package com.psh.no61_70.no61;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String message = new Scanner(System.in).nextLine();
        System.out.println(solution(message));
    }

    static int solution(String message) {
        return message.length() * 2;
    }
}
