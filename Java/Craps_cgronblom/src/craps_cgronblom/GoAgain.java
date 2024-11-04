/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package craps_cgronblom;

import java.util.Scanner;

import java.io.*;
import java.util.ArrayList;

public class GoAgain {
    
    // Ask user if they want to continue the loop
    public void goAgain(){
        
        // Create new instance of scanner class for user input
        Scanner userInput = new Scanner(System.in);
        
        // String to hold user input (y/n)
        String strkeepGoing = "y";
        
        // While loop
        while(strkeepGoing.equalsIgnoreCase("y") || strkeepGoing.equalsIgnoreCase("yes")){
            // Debugging
            //System.err.println("Inside the while loop");
            
            // Add Source code here
            // --------------------
            
            //How should the game begin?
            //How should the game be played?
            //What might be used to facilitate rolling of the dice?
            //How to enforce the rules of the game?
            //How to determine a win, loss or draw?
            //How to display processing?
            //How to keep track of bets, wins and losses?
            //Display final results, game status and financial balance?
            //How to end the game?
            
            
            // Create new Player
            
            System.out.print("Please input a player name: ");
            String playerName = userInput.nextLine();
            
            float startingMoney = 500.0f;

            CrapsPlayer player = new CrapsPlayer(playerName, startingMoney);
            
            System.out.println(player);
            
            // Present betting options
            
            float currentBet = showBetMenu(player.currentMoney);

            // Hop Bet

            System.out.print("Do you want to bet on a certian dice value?: ");
            int bettingOnDiceValue = 0;
            float hopBet = 0.0f;
            if(userInput.nextLine().equalsIgnoreCase("y")){
                while (bettingOnDiceValue < 2 && bettingOnDiceValue > 12){
                    System.out.print("What will the combined value of the dice be?: ");
                    bettingOnDiceValue = userInput.nextInt();
                }

                hopBet = showBetMenu(player.currentMoney);

                System.out.println("You are betting $" + String.format("%,3.2f", hopBet) + " on the combined value of the dice being " + bettingOnDiceValue);
            }

            // Roll Dice
            
            System.out.print("Ready?: ");
            String ready = userInput.nextLine();
            while (!ready.equalsIgnoreCase("y")){
                for (int i = 0; i < 3; i++) {
                    System.out.print("WAITING");
                    for (int j = 0; j < 3; j++) {
                        try {
                            Thread.sleep(500);
                        } catch (Exception e) {
                        }
                        System.out.print(".");
                    }
                    
                    System.out.println();

                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
                
                System.out.print("How about now?: ");
                ready = userInput.nextLine();
            }

            System.out.println("Rolling Dice...");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            System.out.println("Doing ADVANCED calculations...");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            System.out.println("Have a gambling problem? Call 1-800-662-HELP for substance abuse help...");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            int firstDice = rollDice();
            int secondDice = rollDice();

            int total = firstDice + secondDice;
            
            // Handle bet

            // Check if hopbet matches

            if(bettingOnDiceValue == total){
                player.currentMoney += hopBet;
                System.out.println("Lucky you, your hop bet was correct! $" + String.format("%,3.2f", hopBet) + " has been added to your bank.");
            }else if(bettingOnDiceValue != 0){
                player.currentMoney -= hopBet;
                System.out.println("Sorry, your hop bet was incorrect... $" + String.format("%,3.2f", hopBet) + " has been taken from your bank.");
            }

            switch (total) {
                case 7:
                    // Win
                    break;
                case 11:
                    // Win
                    break;
                case 2:
                    // Lose
                    break;
                case 3:
                    // Lose
                    break;
                case 12:
                    // Lose
                    break;
                default:
                    // Roll again but need to match total
                    break;
            }

            // --------------------
            // End Source Code
            
            // Ask user to run again
            System.out.print("\nWould you like to run again?: ");
            // Read user input
            strkeepGoing = userInput.next();
            System.out.println("");
        }

        // Close user input to resolve resource leak
        userInput.close();

    } // END goAgain()
    
    // WIP File management
    // -----
    void CreateFile(Scanner userInput){
        System.out.print("Please enter a file name: ");    
        String fileName = userInput.next();
        
        try {
            FileWriter newFile = new FileWriter(fileName, true);

            PrintWriter printer = new PrintWriter(newFile);

            printer.println("data");
            printer.close();
        } catch (Exception e) {
            System.out.print("File already exists!");  
            CreateFile(userInput);
        }
    }
    
    // -----
    // End File Management
    
    int rollDice(){
        int rolledValue = (int)(Math.floor(Math.random() * 6));
        System.out.println("Rolled a " + String.valueOf(rolledValue + 1));
        return rolledValue + 1;
    }
    
    float showBetMenu(float currentMoney){
        
        ArrayList<String> menuItems = new ArrayList<String>();
        
        float currentMaxbet = 5.00f;
        while(currentMaxbet < currentMoney && currentMaxbet < 50){
            menuItems.add("$" + String.format("%,3.2f", currentMaxbet));
            currentMaxbet += 10.00f;
        } 
        
        Menu betMenu = new Menu();
        
        // Return bet
        return betMenu.showMenu("Please select a bet:", menuItems) * 10 - 5;
    }
 
} // END CLASS