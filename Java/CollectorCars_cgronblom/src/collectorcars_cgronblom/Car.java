/************************
 * Title: Car
 * Date: November 2024
 * Author: Cyrus Gronblom
 * Purpose: Store the data for a car object
 * **********************
 */

package collectorcars_cgronblom;

public class Car { // Car Class

    // What it needs to store

    // Year, make, model, color...
    int intYear; // Year car was made
    String strMake; // Company which make the car
    String strModel; // Model of the car
    String strColor; // Color of car

    // Car constructor
    public Car(int intYear, String strMake, String strModel, String strColor){
        this.intYear = intYear;
        this.strMake = strMake;
        this.strModel = strModel;
        this.strColor = strColor;
    } // End Constructor

    public String toString(){
        return "----------\n"
             + "Year: " + intYear + "\n"
             + "Make: " + strMake + "\n"
             + "Model: " + strModel + "\n"
             + "Color" + strColor + "\n"
             + "----------";
    }

    // Accessors

    public int getIntYear() {
        return intYear;
    }

    public void setIntYear(int intYear) {
        this.intYear = intYear;
    }

    public String getStrMake() {
        return strMake;
    }

    public void setStrMake(String strMake) {
        this.strMake = strMake;
    }

    public String getStrModel() {
        return strModel;
    }

    public void setStrModel(String strModel) {
        this.strModel = strModel;
    }

    public String getStrColor() {
        return strColor;
    }

    public void setStrColor(String strColor) {
        this.strColor = strColor;
    }

} // END CLASS
