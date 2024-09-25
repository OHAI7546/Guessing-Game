package assignment;

import java.util.Scanner;

public class StringInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Convert the string to uppercase
        String uppercaseString = userInput.toUpperCase();
        System.out.println("Uppercase: " + uppercaseString);
        

        // Reverse the string
        String reversedString = new StringBuilder(userInput).reverse().toString();
        System.out.println("Reversed: " + reversedString);


        // Count the number of vowels
        int vowelCount = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char ch = Character.toLowerCase(userInput.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);


        // Check if the string is a palindrome
        if (userInput.equalsIgnoreCase(reversedString)) {
            System.out.println(userInput + " is a Palindrome");
        } else {
            System.out.println(userInput + " is not a Palindrome");
        }

        scanner.close();
    }
}





