/************************
 * Title: Circle
 * Date: 12/6/24
 * Author: Cyrus Gronblom
 * Purpose: Stores data for a Circle.
 * **********************
 */

package inclassclasses_cgronblom.Shapes;

public class Circle {

    private double doubleRadius; // Radius of circle

    /** Get the radius of the circle
     * @return the radius of the circle
     */
    public double getdoubleRadius() {
        return doubleRadius;
    }
    
    /** Set the radius of the circle
     * @param doubleRadius desired radius
     */
    public void setRadius(double doubleRadius) {
        this.doubleRadius = doubleRadius;
    }
    
    /** Create new circle
     * @param doubleRadius desired radius
     */
    public Circle(double doubleRadius) {
        this.doubleRadius = doubleRadius;
    }

    /** Calculate the area of the circle
     * @return the area of the circle
     */
    public double calculateCircle(){
        return Math.pow(Math.PI * getdoubleRadius(), 2);
    }

    // Formatted output
    @Override
    public String toString() {
        // Return string
        String reString = " Circle \n" + 
                          " ---------- \n" +
                          " \tRadius: " + getdoubleRadius() + "\n" +
                          " ---------- \n" +
                          " \tArea: " + calculateCircle() + "\n";
        return reString;
    }
}
