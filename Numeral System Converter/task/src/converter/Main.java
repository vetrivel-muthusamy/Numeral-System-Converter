package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, world!");
        //System.out.println("42 = 0b101010");
        Scanner scanner = new Scanner(System.in);
        int base = 8;
        int num = scanner.nextInt();
        int lastDigit = num % base;
        System.out.println(lastDigit);
    }
}