package com.psh.no21_30.no22;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i < n + 1; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
