/************************
 * Title: Punchline
 * Date: 9/5/24
 * Author: Cyrus Gronblom
 * Purpose: Display the beginning of a joke to the user.
 *          Ask's the user if they would like to hear the rest.
 *          Demonstrate learning basic Java code.
 ************************
 */

package hw01_punchline_cgronblom;
import java.util.Scanner;

public class HW01_Punchline_cgronblom {
    // The driver method
    public static void main(String[] args) {
        
        // Instansiate  an instance of a Scanner class to read user input
        Scanner input = new Scanner(System.in);
        
        // Vars to hold joke and punchline
        String strJoke = "\tGuess What?\n"; 
        String strPunchline = "\tChicken-butt.";
        
        // Variable to hold user decision
        String strUser;
        
        // Prompt user if they want to hear a joke
        System.out.print("Would you like to hear a joke?: ");
        
        // Read next input
        strUser = input.next();
        
        // Joke | Program branches here
        // Print joke if user wants to hear a joke
        if(strUser.equalsIgnoreCase("y") || strUser.equalsIgnoreCase("yes")){ 
            System.out.print("\n" + strJoke + "\n");
            // Prompt user for punchline
            System.out.print("Would you like to see the punchline?: ");
            
            // Read next input
            strUser = input.next();
            
            // Punchline
            // Prints the punchline if the user wants to hear it
            if(strUser.equalsIgnoreCase("y") || strUser.equalsIgnoreCase("yes")){
                // Print out punchline 
                System.out.println("\n" + strPunchline);
            } // END PUNCHLINE IF STATEMENT
        } // END OF JOKE IF STATEMENT
        
        // Print Goodbye at the end of program
        System.out.println("\nGoodbye!\n");
    } // END MAIN
} // END CLASS
