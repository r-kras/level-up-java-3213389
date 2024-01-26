package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
    private static int startPoints = 10;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int current = startPoints;
    private boolean isStillPlaying = true;

    public void playGame() {
        System.out.println("Let's play Double or Nothing. We'll start you with 10 points.");
        //askUserToContinue();

        while(this.isStillPlaying) {
            System.out.println("Lets see how you do....");
            
            if (this.random.nextInt(2) == 0) {
                this.current *= 2;
                System.out.println("You won!");
                System.out.println("Would you like to continue and try to double your points?");
                this.isStillPlaying = this.scanner.nextLine().toUpperCase().equals("Y");
            } else {
                System.err.println("Uh oh. You've lost. No points for you.");
                return;
            }
        }
        System.out.printf("Congrats! You finish with %d points!", this.current);
    }

}
