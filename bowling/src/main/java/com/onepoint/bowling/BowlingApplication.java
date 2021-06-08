package com.onepoint.bowling;

import java.util.Scanner;

public class BowlingApplication {

    static Scanner keyboard = new Scanner(System.in);
    static int total_score, score;

    public static void main(String[] args) {
        StartGame();
        StartRoll();
        EndGame();
    }

    public static void StartGame() {
        System.out.println("Hello new player, please insert your sequence of rolls");
    }

    public static void StartRoll() {
        int[] tries = new int[2];
        int intermediate_score = 0;

        // TODO: Add limit to 11 for this
        for (int i = 1; i < 5; i++) {
            System.out.println("Roll " + i);
            for (int j = 1; j < 3; j++) {
                System.out.println("Try " + j);
                tries[intermediate_score] = keyboard.nextInt();
                score += tries[intermediate_score];
            }
            System.out.println("Your score for roll " + i + " is : " + score);
            total_score += score;
            System.out.println("Your total score is : " + total_score);
            score = 0;
        }
    }

    public static void EndGame() {
        System.out.println("Your final score for this game is : " + total_score);
    }

}