 /****************************************
 *   Title: MPG 
 *   Author: Mick M. Mouse
 *   Date: September 2024
 *   Purpose: Driver Class: 
 *   Prints a title using the Title class.
 *   Instantiates an instance of the GoAgain class, 
 *   and uses the goAgain() method.
 *  ***************************************/

package monyonmpg;

public class MonyonMPG 
{
    // Driver method.
    public static void main(String[] args) 
    {
        Title title = new Title();
        title.printTitle("MPG", "Measure your vehicle's fuel mileage.");
        
        GoAgain george = new GoAgain();
        george.getClass();
    } // END OF main() METHOD.
} // END OF CLASS.
