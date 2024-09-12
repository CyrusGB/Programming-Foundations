/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose:
 * **********************
 */

package utilities;

import java.util.Scanner;


public class GoAgain {
    
    public void goAgain(){
        // Create new instance of scanner class for user input
        Scanner userInput = new Scanner(System.in);
        
        // String to hold user input (y/n)
        String strkeepGoing = "y";
        
        // While loop
        while(strkeepGoing.equalsIgnoreCase("y") || strkeepGoing.equalsIgnoreCase("yes")){
            System.err.println("Inside the while loop");
            
            System.out.print("Would you like to run again?: ");
            strkeepGoing = userInput.next();
        } // END while()
        
    } // END goAgain
} // END CLASS
