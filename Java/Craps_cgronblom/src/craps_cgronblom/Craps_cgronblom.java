/************************
 * Title: Craps
 * Date: November 2024
 * Author: Cyrus Gronblom
 * Purpose: Make a working craps game
 * **********************
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

    } // END MAIN

} // END CLASS
