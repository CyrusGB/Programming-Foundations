/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw01_punchline_cgronblom;
import java.util.Scanner;

public class HW01_Punchline_cgronblom {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Vars to hold joke and punchline
        String strJoke = "Guess What";
        String strPunchline = "Chicken-butt.";
        
        //Print out joke
        System.out.println(strJoke);
        
        // Prompt user for punchline
        System.out.print("Would you like to see the punchline? (y for yes): ");
        // Variable to hold user decision
        String strGo = input.next();
        if(strGo.equalsIgnoreCase("y")){ // Prints the punchline if the user says yes otherwise it prints goodbye
            // Print out punchline 
            System.out.println(strPunchline);
        }else{
            // Print Goodbye!
            System.out.println("Goodbye!");
        }
        
    }    
}
