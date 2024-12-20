/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package craps_cgronblom;

import java.util.Scanner;

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
            
            // Get player name
            System.out.print("Please input a player name: ");
            String playerName = userInput.nextLine();
            
            // Starting money
            float startingMoney = 100.0f;

            // Create new player object
            CrapsPlayer player = new CrapsPlayer(playerName, startingMoney);
            
            // Show play menu
            showPlayMenu(player);

            //#region old
            // // Present betting options
            // // ------

            // // Current bet
            // float currentBet = showBetMenu(player.currentMoney);

            // // Hop Bet
            // // ------

            // // Ask user if they want to hop bet
            // System.out.print("Do you want to bet on a dice value?: ");
            // // Desired dice value
            // int bettingOnDiceValue = 0;
            // // Hop bet amount
            // float hopBet = 0.0f;
            // if(userInput.nextLine().equalsIgnoreCase("y")){
            //     while (bettingOnDiceValue < 2 && bettingOnDiceValue > 12){
            //         System.out.print("What will the combined value of the dice be?: ");
            //         bettingOnDiceValue = userInput.nextInt();
            //     }

            //     hopBet = showBetMenu(player.currentMoney);

            //     System.out.println("You are betting $" + String.format("%,3.2f", hopBet) + " on the combined value of the dice being " + bettingOnDiceValue);
            // }

            // // Roll Dice
            
            // System.out.print("Ready?: ");
            // String ready = userInput.nextLine();
            // while (!ready.equalsIgnoreCase("y")){
            //     for (int i = 0; i < 3; i++) {
            //         System.out.print("WAITING");
            //         for (int j = 0; j < 3; j++) {
            //             try {
            //                 Thread.sleep(500);
            //             } catch (Exception e) {
            //             }
            //             System.out.print(".");
            //         }
                    
            //         System.out.println();

            //         try {
            //             Thread.sleep(500);
            //         } catch (Exception e) {
            //         }
            //     }
                
            //     System.out.print("How about now?: ");
            //     ready = userInput.nextLine();
            // }

            // System.out.println("Rolling Dice...");

            // try {
            //     Thread.sleep(1000);
            // } catch (Exception e) {
            // }

            // System.out.println("Doing ADVANCED calculations...");

            // try {
            //     Thread.sleep(1000);
            // } catch (Exception e) {
            // }

            // System.out.println("Have a gambling problem? Call 1-800-662-HELP for substance abuse help...");

            // try {
            //     Thread.sleep(1000);
            // } catch (Exception e) {
            // }

            // int firstDice = rollDice();
            // int secondDice = rollDice();

            // int total = firstDice + secondDice;
            
            // // Handle bet

            // // Check if hopbet matches

            // if(bettingOnDiceValue == total){
            //     player.currentMoney += hopBet;
            //     System.out.println("Lucky you, your hop bet was correct! $" + String.format("%,3.2f", hopBet) + " has been added to your bank.");
            // }else if(bettingOnDiceValue != 0){
            //     player.currentMoney -= hopBet;
            //     System.out.println("Sorry, your hop bet was incorrect... $" + String.format("%,3.2f", hopBet) + " has been taken from your bank.");
            // }

            // switch (total) {
            //     case 7:
            //         // Win
            //         break;
            //     case 11:
            //         // Win
            //         break;
            //     case 2:
            //         // Lose
            //         break;
            //     case 3:
            //         // Lose
            //         break;
            //     case 12:
            //         // Lose
            //         break;
            //     default:
            //         // Roll again but need to match total
            //         break;
            // }
            //#endregion

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
    
    //#region File management
    // WIP File management
    // -----
    // void CreateFile(Scanner userInput){
    //     System.out.print("Please enter a file name: ");    
    //     String fileName = userInput.next();
        
    //     try {
    //         FileWriter newFile = new FileWriter(fileName, true);

    //         PrintWriter printer = new PrintWriter(newFile);

    //         printer.println("data");
    //         printer.close();
    //     } catch (Exception e) {
    //         System.out.print("File already exists!");  
    //         CreateFile(userInput);
    //     }
    // }
    
    // -----
    // End File Management
    //#endregion
    
    void showPlayMenu(CrapsPlayer player){

        System.out.println(player);

        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("Bet on a win");
        menuItems.add("Hop Bet (Bet on a dice value)");
        menuItems.add("Ready to play");

        MultiColumnMenu playMenu = new MultiColumnMenu("Play Menu", "Choose an option: ", menuItems, 1);
        int selection = playMenu.showMenu();

        switch (selection) {
            case 0: // Normal Bet
                bet(player);
                break;
            case 1: // Hop bet
                hopBet(player);    
                break;    
            case 2: // Play a round
                playARound(player);
                break;  
        }
    }

    void playARound(CrapsPlayer player){
        int first = rollDice();
        int second = rollDice();
        
        // Check if keep rolling
        if (first + second == 7 || first + second == 11){
            System.out.println("WIN! through normal");
            player.currentMoney += player.bet * 2;
            player.bet = 0;
        }else if (first + second == 2 || first + second == 3 || first + second == 12){
            System.out.println("You crapped out... lose");
            // Dont take money from player becuase its already been taken and stored in the bet var
            player.bet = 0;

            if (player.currentMoney == 0 && player.hopBet == 0){
                lose(player);
                return;
            }
        }

        if (player.hopBet != 0){
            if (first + second == player.desiredDiceValue){
                System.out.println("Win! through hop bet");
                player.currentMoney += player.hopBet * 2;
            }else{
                System.out.println("Lose hop bet");
                player.hopBet = 0;
                if (player.currentMoney == 0){
                    lose(player);
                }
            }
        }
        

        System.out.print("\nKeep playing?: ");
        @SuppressWarnings("resource")
        Scanner keepPlay = new Scanner(System.in);
        boolean boolKeep = keepPlay.next().equalsIgnoreCase("y");
        if (boolKeep) {
            player.bet = 0;
            player.hopBet = 0;
            player.desiredDiceValue = 0;
            showPlayMenu(player);
        }

    }

    void lose(CrapsPlayer player){
        System.out.println("YOU LOse!");
    }

    int rollDice(){
        int rolledValue = (int)(Math.floor(Math.random() * 6));
        System.out.println("Rolled a " + String.valueOf(rolledValue + 1));
        return rolledValue + 1;
    }
    
    // Shows the bet menu and returns the bet requested
    int showBetMenu(CrapsPlayer player, String menuName){
        // Bet options
        ArrayList<String> betOptions = new ArrayList<String>();
        
        // Lowest possible bet
        float currentMaxbet = 5.00f;
        // Add bet possibities
        while(currentMaxbet < player.currentMoney + 5 && currentMaxbet < 50){
            betOptions.add("$" + String.format("%,3.2f", currentMaxbet));
            currentMaxbet += 5.00f;
        } 
        
        MultiColumnMenu betMenu = new MultiColumnMenu(menuName, "Choose a bet: ", betOptions, 3);
        
        return ((betMenu.showMenu() + 1) * 10) - 5;
    }

    // Bet on a win
    void bet(CrapsPlayer player){
        // Show bet menu
        float newBet = showBetMenu(player, "Bet on a win:");
        // Remove moeny from account but return old bet so that we dont take more money than what is actually requested
        player.currentMoney += player.bet;
        player.currentMoney -= newBet;
        player.bet = newBet;

        showPlayMenu(player);
    }

    // Bet on a dice value
    void hopBet(CrapsPlayer player){

        @SuppressWarnings("resource")
        Scanner userInput = new Scanner(System.in);

        int diceValue = 0;
        while (diceValue <= 0 || diceValue > 12){
            System.out.print("Bet on a dice value: ");
            diceValue = userInput.nextInt();
            
        }

        

        player.desiredDiceValue = diceValue;
        
        // Show bet menu
        float newBet = showBetMenu(player, "Hop bet (Dice value will be: " + diceValue + ")");
        // Remove moeny from account but return old bet so that we dont take more money than what is actually requested
        player.currentMoney += player.hopBet;
        player.currentMoney -= newBet;
        player.hopBet = newBet;

        showPlayMenu(player);
    }
 
} // END CLASS