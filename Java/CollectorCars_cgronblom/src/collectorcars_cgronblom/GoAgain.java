/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package collectorcars_cgronblom;

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
            
            // Add crud capability
            // Create [record]
            // Read [record]
            // Update [record]
            // Delete [record]
            
            ArrayList<Car> lstCars = new ArrayList<Car>();

            Car carGolf = addCar(lstCars, 1982, "Volkswagen", "Golf GTI Mk2", "Midnight Blue-Pearl");

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

    public Car addCar(ArrayList<Car> cars, int year, String make, String model, String color){
        Car newCar = new Car(year, make, model, color);
        cars.add(newCar);
        return newCar;
    }
    
} // END CLASS