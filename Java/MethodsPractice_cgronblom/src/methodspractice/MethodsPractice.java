/*****************************************************
 *  
 *   Title: MethodsPractice
 *   Author: Cyrus Gronblom
 *   Date: October, 2024
 *   Purpose: Demonstrate the creation and use
 *   of Java methods().
 *   
 *  
 *****************************************************/
package methodspractice;

import java.util.ArrayList;
import java.util.Scanner;



public class MethodsPractice 
{
    //*************************************************/
    
    static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args) {
        keepGoing();
    } // END OF main() METHOD.
    
    public static void keepGoing(){
        
        String strKeepGoing = "y";
        
        while(strKeepGoing.equalsIgnoreCase("y")) {
            // Source code here
            
            // Write a method that accepts a floating-point number and squares it. done
            // Square it
            System.out.print("Please insert a float to square: ");
            double dbl = userInput.nextFloat();
            System.out.println("That float squared is: " + squareIt(dbl) + "\n");
            
            // Write a method to get the dimensions of a rectangle. done
            // Write a method to calculate the area of a rectangle. done
            // Rectangle
            getRect();
            
            // Write a method to get the dimensions of a triangle. done
            // Write a method to calculate the area of a triangle. done
            // Triangle
            getTri();
            
            System.out.println("The Acreage of your lot is: " + getAcreage()+ "\n");
            
            // Write a method to calculate temperature converter. done
            // Temp Calculator
            System.out.print("Please enter farenheit temp to convert to celcius: ");
            int cel = userInput.nextInt();
            System.out.println("That temperature converted to celcius is: " + getCelcius(cel));
            
            // Write a method to convert currency from dollars to 
            // Euros, British pounds and to Canadian dollars. done? we did this such that it can convert any currency in class so im confused
            // I could rewrite to convert or leave this idk?
            System.out.print("\nEnter dollar amount: ");
            double amount = userInput.nextDouble();
            System.out.print("Enter the conversion rate: ");
            double rate = userInput.nextDouble();
            System.out.println("The converted amount is: " + convertCurrency(amount, rate));
            
            // End source code
            
            System.out.print("\nWould you like to go again?: ");
            strKeepGoing = userInput.next();
        }
        
        
    } // END OF keepGoing() METHOD.
    
    // Squares a double
    static double squareIt(double number){
        // Return squared number
        return Math.pow(number, 2);
    }// END squareIt()
    
    // Creates a new rectangle object by prompting the user for the dimensions
    static void getRect(){
        
        // Prompt for width
        System.out.print("Please input the width of a rectangle: ");
        double dblWidth = userInput.nextDouble();
        
        // Prompt for height
        System.out.print("Please input the height of a rectangle: ");
        double dblHeight = userInput.nextDouble();
        
        // Print out the acreage
        System.out.println("\nThe area of a " + dblWidth + "x" + dblHeight + " rectangle is: " + getRectArea(dblWidth, dblHeight) + "^2\n");
        
    } // END getRect()
    
    // Get the area of a rectangle using the width and height
    static double getRectArea(double width, double height){
        return width * height;
    } // END getRectArea()
    
    static void getTri(){

        double[] dblXPositions = new double[3]; // X positions
        double[] dblYPositions = new double [3]; // Y positions
        
        // Ask for 3 points of a triangle
        for (int timesAsked = 0; timesAsked < 3; timesAsked++) {
            System.out.print("Please enter a point of a triangle ("+ String.valueOf(timesAsked + 1) + "). (ie: X,Y): "); // Prompt
            String strPos = userInput.next();
            // Add input to list of pts
            dblXPositions[timesAsked] = Double.valueOf(strPos.split(",")[0]);
            dblYPositions[timesAsked] = Double.valueOf(strPos.split(",")[1]);
            //System.out.println(dblXPositions[timesAsked] + "," + dblYPositions[timesAsked]);
            
        } // END pts
        
        //Print area
        System.out.println("\nThe area of that triangle is: " + getTriArea(dblXPositions, dblYPositions) + "^2\n");
        
    } // END getTri()
    
    // Get the area of a triangle from 3 points
    static double getTriArea(double[] xPositions, double[] yPositions){
        // A = (1/2) |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|
        // The area of that triangle lies before you...
        return 0.5 * Math.abs((xPositions[0] * (yPositions[1] - yPositions[2])) + (xPositions[1] * (yPositions[2] - yPositions[0])) + (xPositions[2] * (yPositions[0] - yPositions[1])));
    } // END getTriArea()
    
    
    // Get the acreage of a plot of land
    static double getAcreage(){
        
        // Prompt for width
        System.out.print("Please input the width of your lot: ");
        double dblWidth = userInput.nextDouble(); // Width of lot
        
        // Prompt for height
        System.out.print("Please input the length of your lot: ");
        double dblHeight = userInput.nextDouble(); // Height of lot
        
        return (dblWidth * dblHeight) / 43560; // Return the acreage
        
    } // END getAcreage()
    
    // Convert Farenheit to Celcius
    static int getCelcius(int farenheit){
        return 5 / 9 * (farenheit - 32); // Return converted temp
    } // END getCelcius()
    
    // Convert any currency to another currency with a set rate.
    static double convertCurrency(double amount, double rate){
        return amount * rate; // Return converted amount
    } // END convertCurrency()
    
} // END OF CLASS.
 

