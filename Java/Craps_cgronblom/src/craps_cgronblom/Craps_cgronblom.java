/************************
 * Title: Craps
 * Date: November 2024
 * Author: Cyrus Gronblom
 * Purpose: Make a working craps game
 * **********************
 * https://keene.instructure.com/courses/2289958/assignments/35372506
 */

package craps_cgronblom;

public class Craps_cgronblom {
    // Driver method, main
    public static void main(String[] args) {
        
        // Create new instances of title and go again
        Title title = new Title();
        GoAgain goAgain = new GoAgain();
        
        // Print Title
        title.printTitle("CRAPS", "Its a gambling game");

        // Start the loop and ask user if they want to go again after
        goAgain.goAgain();

        // Game variables
        // float currentBet;
        // float hopBet;
        // int desiredDiceValue;

    } // END MAIN

} // END CLASS
