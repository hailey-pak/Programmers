package n120818_옷가게할인받기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int price = new Scanner(System.in).nextInt();
        System.out.print(solution(price));
    }

    static int solution(int price) {
        if (price >= 500000) return (int) (price * 0.8);
        if (price >= 300000) return (int) (price * 0.9);
        if (price >= 100000) return (int) (price * 0.95);
        return price;
    }
}
