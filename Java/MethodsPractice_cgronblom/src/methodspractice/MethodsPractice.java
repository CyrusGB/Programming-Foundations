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
            Rectangle rect = getRect();
            System.out.println("The area of that rectangle is: " + rect.getArea() + "\n");
            
            // Write a method to get the dimensions of a triangle. done
            // Write a method to calculate the area of a triangle. done
            // Triangle
            Triangle tri = getTri();
            System.out.println("The area of that triangle is: " + tri.getArea() + "\n");
            
            System.out.println("The Acreage of your lot is: " + getAcreage() + "\n");
            
            // Write a method to calculate temperature converter. 
            // Temp Calculator
            
            // Write a method to convert currency from dollars to 
            // Euros, British pounds and to Canadian dollars.
            
            // End source code
            
            System.out.print("Would you like to go again?: ");
            strKeepGoing = userInput.next();
        }
        
        
    } // END OF keepGoing() METHOD.
    
    // Squares a double
    static double squareIt(double number){
        // Return squared number
        return Math.pow(number, 2);
    }// End squareIt()
    
    // Creates a new rectangle object by prompting the user for the dimensions
    static Rectangle getRect(){
        
        // Prompt for width
        System.out.print("Please input the width of a rectangle: ");
        double dblWidth = userInput.nextDouble();
        
        // Prompt for height
        System.out.print("Please input the height of a rectangle: ");
        double dblHeight = userInput.nextDouble();
        
        // Return new rectangle
        return new Rectangle(dblWidth, dblHeight);
        
    } // END getRect()
    
    static Triangle getTri(){

        // Prompt for width
        System.out.print("Please input the width of a triangle: ");
        double dblWidth = userInput.nextDouble();
        
        // Prompt for height
        System.out.print("Please input the height of a triangle: ");
        double dblHeight = userInput.nextDouble();
        
        // Return new Triangle
        return new Triangle(dblWidth, dblHeight);
        
    }
    
    static double getAcreage(){
        
        // Prompt for width
        System.out.print("Please input the width of your lot: ");
        double dblWidth = userInput.nextDouble();
        
        // Prompt for height
        System.out.print("Please input the length of your lot: ");
        double dblHeight = userInput.nextDouble();
        
        return (dblWidth * dblHeight) / 43560;
    }
    
    
} // END OF CLASS.
 

