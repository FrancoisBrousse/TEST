package com.onepoint.bowling;

import java.util.Scanner;

public class BowlingApplication {

    static Scanner keyboard = new Scanner(System.in);
    static int total;

    public static void main(String[] args) {
        StartGame();
        StartRoll();
        EndGame();
    }

    public static void StartGame() {
        System.out.println("Hello new player, please insert your sequence of rolls");
    }

    public static void StartRoll() {
        int[] roll = new int[10];
        int score = 0;

        for (int i = 1; i < 11; i++) {
            System.out.println("Roll " + i);
            roll[score] = keyboard.nextInt();
            total += roll[score];
        }
    }

    public static void EndGame() {
        System.out.println("Your total score for this game is : " + total);
    }

}
