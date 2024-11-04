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
import java.util.Iterator;


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
            
            ShowBetMenu(player.currentMoney);
            
            // Roll Dice
            
            
            // Handle bet
            
            // --------------------
            // End Source Code
            
            // Ask user to run again
            System.out.print("\nWould you like to run again?: ");
            // Read user input
            strkeepGoing = userInput.next();
            System.out.println("");
        }

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
        int rolledValue = (int)(Math.floor(Math.random() * 7));
        return rolledValue;
    }
    
    void ShowBetMenu(float currentMoney){
        
        ArrayList<String> menuItems = new ArrayList<String>();
        
        float currentMaxbet = 5.00f;
        while(currentMaxbet < currentMoney && currentMaxbet < 50){
            menuItems.add("$" + String.format("%,3.2f",currentMaxbet));
            currentMaxbet += 10.00f;
        } 
        
        Menu betMenu = new Menu();
        int betAmount = betMenu.showMenu("Please select a bet:", menuItems) * 10 - 5;
    }
    
    
    
} // END CLASS