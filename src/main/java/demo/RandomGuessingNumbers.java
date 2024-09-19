package demo;

import java.util.Random;
import java.util.Scanner;

public class RandomGuessingNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game Show!");
        System.out.println("I have a number between 1 to 100, who can guess what the number is?");

        while (guess != randomNumber) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;


            if (guess > randomNumber) {
                System.out.println("Number Too high! Please Try again.");
            } else if (guess < randomNumber) {
                System.out.println("Number Too low! Please Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
                System.out.println("Kindly drop your account details to get your cash gift. Congratulations Once Again!!");

            }
        }

        scanner.close();
    }
}

