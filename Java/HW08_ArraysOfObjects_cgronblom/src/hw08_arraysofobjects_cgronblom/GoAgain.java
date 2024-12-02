/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package hw08_arraysofobjects_cgronblom;

import java.util.Scanner;

import java.util.ArrayList;

public class GoAgain {
    
    // Create new instance of scanner class for user input
    Scanner userInput = new Scanner(System.in);

    // List of names of cars (for menu)
    ArrayList<String> lstCarStrings = new ArrayList<String>();

    // List of cars
    ArrayList<Car> lstCars = new ArrayList<Car>();

    // Add cars to lists
    Car carGolf = addCar(lstCars, lstCarStrings, 1982, "Volkswagen", "Golf GTI Mk2", "Midnight Blue-Pearl");
    Car carChevyTruck = addCar(lstCars, lstCarStrings, 2024, "Chevrolet", "Colorado", "Boring ass grey");
    Car carTesla = addCar(lstCars, lstCarStrings, 2025, "Tesla", "Model S", "Red");
    Car carJetta = addCar(lstCars, lstCarStrings, 1999, "Volkswagen", "Jetta", "Blue");
    
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

            // Menu for car selection
            MultiColumnMenu menu = new MultiColumnMenu("Your Garage", "Trade in which car?: ", lstCarStrings, 1);

            // Selected car
            int intSelection =  menu.showMenu();

            // Remove car from the array
            lstCarStrings.remove(intSelection);
            lstCars.remove(intSelection);

            // Prompt user for a new car
            promptForNewCar();

            // --------------------
            // End Source Code
            
            // Ask user to run again
            System.out.print("\nWould you like to trade in another?: ");
            // Read user input
            strkeepGoing = userInput.next();
            System.out.println("");

            

            System.out.println("Your garage:\n");
            
            // Print out all of the cars
            for (Car car : lstCars) {
                System.out.println(car);
            }

            System.out.println("----------");
        }

        // Close user input to resolve resource leak
        userInput.close();

    } // END goAgain()

    // Add a car to a list
    public Car addCar(ArrayList<Car> lstCars, ArrayList<String> lstMenuStrings,int intYear, String strMake, String strModel, String strColor){
        Car newCar = new Car(intYear, strMake, strModel, strColor); // New car
        lstCars.add(newCar); // Add car to list
        lstMenuStrings.add(newCar.getIntYear() + " " + newCar.getStrColor() + " " + newCar.getStrMake() + " " + newCar.getStrModel()); // Add car to menu list
        return newCar;
    } // End addCar

    // Prompt user for a new car
    public void promptForNewCar(){ 
        System.out.print("Please enter new make: "); // Make
        String strMake = userInput.nextLine();
        System.out.print("Please enter new model: "); // Model
        String strModel = userInput.nextLine();
        System.out.print("Please enter new color: "); // Color
        String strColor = userInput.nextLine();
        System.out.print("Please enter new year: "); // Year
        int intYear = userInput.nextInt();
        addCar(lstCars, lstCarStrings, intYear, strMake, strModel, strColor); // New car
    } // End promptForNewCar
    
} // End Class