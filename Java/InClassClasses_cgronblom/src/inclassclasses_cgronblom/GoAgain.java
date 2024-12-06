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

import inclassclasses_cgronblom.Shapes.Circle;
import inclassclasses_cgronblom.Shapes.Rectangle;
import inclassclasses_cgronblom.Shapes.Triangle;

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

            // Get Rectangle dimensions
            String[] arrStrRectDimensions = JOptionPane.showInputDialog("Please insert the width and height of a rectangle/square (\"width\"x\"height\"):").split("x");
            // Create new rectangle from dimensions
            Rectangle rect = new Rectangle(Double.parseDouble(arrStrRectDimensions[0]), Double.parseDouble(arrStrRectDimensions[1]));
            // Print data
            System.out.println(rect);

            // Points from user
            double[][] arrPointsFromUser = new double[3][2];
            // Collect points
            // First point
            String[] arrStrPoint = JOptionPane.showInputDialog("Please insert the first point of a triangle (\"x,y\"):").split(",");
            double[] arr1stPt = {Double.parseDouble(arrStrPoint[0]), Double.parseDouble(arrStrPoint[1])};

            // Second Point
            arrStrPoint = JOptionPane.showInputDialog("Please insert the second point of a triangle (\"x,y\"):").split(",");
            double[] arr2ndPt = {Double.parseDouble(arrStrPoint[0]), Double.parseDouble(arrStrPoint[1])};

            // Last point
            arrStrPoint = JOptionPane.showInputDialog("Please insert the third point of a triangle (\"x,y\"):").split(",");
            double[] arr3rdPt = {Double.parseDouble(arrStrPoint[0]), Double.parseDouble(arrStrPoint[1])};

            // Set points
            arrPointsFromUser[0] = arr1stPt;
            arrPointsFromUser[1] = arr2ndPt;
            arrPointsFromUser[2] = arr3rdPt;

            // Create triangle from points
            Triangle tri = new Triangle(arrPointsFromUser);
            // Print data
            System.out.println(tri);

            // Get radius
            double dblRad = Double.parseDouble(JOptionPane.showInputDialog("Please insert the radius of a circle: "));
            // Create circle from radius
            Circle circ = new Circle(dblRad);
            // Print data
            System.out.println(circ);

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