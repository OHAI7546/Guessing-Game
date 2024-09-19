package demo;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Random random = new Random();

        int rock = 1;
        int paper = 2;
        int scissors = 3;

        int computer = random.nextInt(3) + 1;

        Scanner scanner = new Scanner(System.in);

        int totalScore = 0;

        System.out.println("Welcome on Board to tonight game!");
    }
}
