package com.onepoint.bowling;

import java.util.Scanner;

public class BowlingApplication {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String [] args) {
        StartGame();

        int [] roll = new int[10];
        int score = 0;
        int total = 0;

        for (int i = 1; i < 11; i++) {
            System.out.println("Roll " + i);
            roll[score] = keyboard.nextInt();
            total += roll[score];
        }
        System.out.println("Your total score is : " + total);
    }

    public static void StartGame() {
        String introduction = "Hello new player, please insert your sequence of rolls";
        System.out.println(introduction);
    }

}
