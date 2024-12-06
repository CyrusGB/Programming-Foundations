/************************
 * Title: Rectangle
 * Date: 12/6/24
 * Author: Cyrus Gronblom
 * Purpose: Stores data for a rectangle.
 * **********************
 */

package inclassclasses_cgronblom.Shapes;

public class Rectangle {
 
    private double doubleWidth, doubleHeight; // Dimensions

    /** Get width
     * @return the width of the rectangle
     */
    public double getdoubleWidth() {
        return doubleWidth;
    }

    /** Set width
     * @param doubleWidth desired width
     */
    public void setdoubleWidth(double doubleWidth) {
        this.doubleWidth = doubleWidth;
    }


    /** Get height
     * @return the height of the rectangle
     */
    public double getdoubleHeight() {
        return doubleHeight;
    }

    /** Set height
     * @param doubleHeight desired height
     */
    public void setdoubleHeight(double doubleHeight) {
        this.doubleHeight = doubleHeight;
    }

    /** Create new rectangle
     * @param doubleWidth desired width
     * @param doubleHeight desired height
     */
    public Rectangle(double doubleWidth, double doubleHeight) {
        this.doubleWidth = doubleWidth;
        this.doubleHeight = doubleHeight;
    }
    
    /** Calculate area of rectangle
     * @return area of rectangle
     */
    public double calculateRectangle(){
        return getdoubleWidth() * getdoubleHeight();
    }
    
    // Formatted output
    @Override
    public String toString() {
        // Return string
        String reString = " Rectangle \n" + 
                          " ---------- \n" +
                          " \tWidth: " + getdoubleWidth() + "\n" +
                          " \tHeight: " + getdoubleHeight() + "\n" + 
                          " ---------- \n" +
                          " \tArea: " + calculateRectangle() + "\n";
        return reString;
    }
}
