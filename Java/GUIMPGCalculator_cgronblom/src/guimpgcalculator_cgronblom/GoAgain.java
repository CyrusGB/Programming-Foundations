/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package guimpgcalculator_cgronblom;

import java.util.Scanner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GoAgain {

    // Create new instance of scanner class for user input
    Scanner userInput = new Scanner(System.in);

    // String to hold user input (y/n)
    String strkeepGoing = "y";

    // Ask user if they want to continue the loop
    public void goAgain(){
        
        // While loop
        while(strkeepGoing.equalsIgnoreCase("y") || strkeepGoing.equalsIgnoreCase("yes")){
            // Debugging
            //System.err.println("Inside the while loop");
            
            // Add Source code here
            // --------------------
            
            CalculatorGUI gui = new CalculatorGUI();
            gui.loadGUI();

            // Miles traveled
            float miles = 0f;
            // KM's traveled
            float kilometers = miles * 1.609344f;
            
            
            // Gallons used
            float gallons = 0f;
            // Liters used
            float liters = gallons * 3.785f;
            
            // Calculate miles per gallon
            float mPG = miles / gallons;
            // Calculate liters per 100 kilometers
            float lP100km = liters / kilometers * 100;

            
            
            // Print out fuel efficiency
            // System.out.println("\nYour car achieved a fuel efficiency of " + (int) mPG + " MPG and " + (int) lP100km + " L/100KM.");

            
            
            // --------------------
            // End Source code
            
            // Ask user to run again
            System.out.print("\nWould you like to run again?: ");
            // Read user input
            strkeepGoing = userInput.next();
            System.out.println("");
            
        } // END while()

        userInput.close();
        
    } // END goAgain()

    // public JFrame createFrame(){
    //     JFrame frame = new JFrame("MPG Calculator");

    //     JPanel panel = new JPanel();

    //     JLabel milesLabel = new JLabel("Miles traveled:");
    //     JTextField milesField = new JTextField(10);
    //     JLabel galLabel = new JLabel("Gallons used:");
    //     JTextField gallonsField = new JTextField(10);
    //     JButton calculateButton = new JButton("Calculate");
        
    //     panel.add(milesLabel);
    //     panel.add(milesField);
    //     panel.add(galLabel);
    //     panel.add(gallonsField);
    //     panel.add(calculateButton);

    //     frame.add(panel);

    //     frame.setSize(400, 400);
    //     frame.pack();

    //     calculateButton.addActionListener(new ActionListener() {
    //         @Override
    //         public void actionPerformed(ActionEvent e) {
    //             String strGal = gallonsField.getText();
    //             System.out.println("Text entered: " + strGal);
    //         }
    //     });

    //     return frame;
    // }
    
} // END CLASS
