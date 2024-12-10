/************************
 * Title:
 * Date:
 * Author: Cyrus Gronblom
 * Purpose:
 * **********************
 */

package guimpgcalculator_cgronblom;

public class GUIMPGCalculator_cgronblom {
    // Driver method, main
    public static void main(String[] args) {
        
        // Create new instances of title and go again
        Title title = new Title();
        
        // Print Title
        title.printTitle("MPG Calculator GUI", "MILES PER GALLON AND STUFF");

        CalculatorGUI gui = new CalculatorGUI();
        gui.loadGUI();

    } // END MAIN

} // END CLASS
