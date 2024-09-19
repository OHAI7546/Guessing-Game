package demo;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your firstname : ");

        int num1 = scanner.nextInt();

        System.out.println("Enter your last name: ");

        int num2 = scanner.nextInt();

        int totalSum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + totalSum);

        scanner.close();

    }
}
