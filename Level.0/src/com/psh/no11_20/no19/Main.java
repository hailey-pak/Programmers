package com.psh.no11_20.no19;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();
        System.out.print(solution(age));
    }

    static int solution(int age) {
        int year = LocalDate.now().getYear();
        return year - age + 1;
    }
}
