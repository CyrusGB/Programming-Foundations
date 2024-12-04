/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package inclassclasses_cgronblom;

import java.util.Scanner;

import javax.swing.JOptionPane;

import inclassclasses_cgronblom.Shapes.Rectangle;

public class GoAgain {
    
    // Create new instance of scanner class for user input
    Scanner userInput = new Scanner(System.in);

    // Ask user if they want to continue the loop
    public void goAgain(){
        
        // String to hold user input (y/n)
        String strkeepGoing = "y";
        
        // While loop
        while(strkeepGoing.equalsIgnoreCase("y") || strkeepGoing.equalsIgnoreCase("yes")){
            // Debugging
            //System.err.println("Inside the while loop");
            
            // Add Source code here
            // --------------------

            String[] arrStrRectDimensions = JOptionPane.showInputDialog("Please insert the width and height of a rectangle/square (\"width\"x\"height\"):").split("x");
            double[] arrDoubleRectDimensions = {Double.parseDouble(arrStrRectDimensions[0]), Double.parseDouble(arrStrRectDimensions[1])};
            Rectangle rect = new Rectangle(arrDoubleRectDimensions[0], arrDoubleRectDimensions[1]);
            System.out.println(rect.calculateRectangle());

            // --------------------
            // End Source Code
            
            // Ask user to run again
            System.out.print("\nWould you like to run again?: ");
            // Read user input
            strkeepGoing = userInput.next();
            System.out.println("");

        } // End while loop

        // Close user input to resolve resource leak
        userInput.close();

    } // END goAgain()
    
} // End Class