/************************
 * Title: Arrays Of Objects
 * Date: 12/2/24
 * Author: Cyrus Gronblom
 * Purpose: Display how we can use lists to store objects and access them
 * **********************
 */

package hw08_arraysofobjects_cgronblom;

public class HW08_ArraysOfObjects_cgronblom {
    // Driver method, main
    public static void main(String[] args) {
        
        // Create new instances of title and go again
        Title title = new Title();
        GoAgain goAgain = new GoAgain();
        
        // Print Title
        title.printTitle("Car Garage", "Trade in cars");

        // Start the loop and ask user if they want to go again after
        goAgain.goAgain();

    } // END MAIN

} // END CLASS
