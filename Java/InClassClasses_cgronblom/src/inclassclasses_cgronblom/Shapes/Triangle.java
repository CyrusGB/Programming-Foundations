/************************
 * Title: Triangle
 * Date: 12/6/24
 * Author: Cyrus Gronblom
 * Purpose: Stores data for a Triangle.
 * **********************
 */

package inclassclasses_cgronblom.Shapes;

public class Triangle {

    private double[][] arrPoints = new double[3][2];
    
    /** Create new triangle
     * @param arrPoints points of new triangle
     */
    public Triangle(double[][] arrPoints) {
        this.arrPoints = arrPoints;
    }

    /** Set a point to a new value
     * @param intPointIndex replace what point
     * @param arrNewPoint new point
     */
    public void setPoint(int intPointIndex, double[] arrNewPoint){
        arrPoints[intPointIndex][0] = arrNewPoint[0];
        arrPoints[intPointIndex][1] = arrNewPoint[1];
    }

    /** Get a point from the list of points int the triangle
     * @param intPointIndex disired point (1st, 2nd, 3rd)
     * @return the point at the point index
     */
    public double[] getPoint(int intPointIndex){
        double[] arrReturnPt = new double[2];
        arrReturnPt[0] = arrPoints[intPointIndex][0];
        arrReturnPt[1] = arrPoints[intPointIndex][1];
        return arrReturnPt;
    }

    /** Calculate the area of the triangle
     * @return the area of the triangle
     */
    public double calculateTriangle(){
        // Calculate area
        return .5 * Math.abs(getPoint(0)[0] * (getPoint(1)[1] - getPoint(2)[1]) + getPoint(1)[0] * (getPoint(2)[1] - getPoint(0)[1]) + getPoint(2)[0] * (getPoint(0)[1] - getPoint(1)[1]));
    }

    // Formatted output
    @Override
    public String toString() {
        // Return string
        String reString = " Triangle \n" + 
                          " ---------- \n" +
                          " \t1st Point: (" + getPoint(0)[0] + ", "+ getPoint(0)[1] + ")\n" +
                          " \t2nd Point: (" + getPoint(1)[0] + ", "+ getPoint(1)[1] + ")\n" +
                          " \t3rd Point: (" + getPoint(2)[0] + ", "+ getPoint(2)[1] + ")\n" +
                          " ---------- \n" +
                          " \tArea: " + calculateTriangle() + "\n";
        return reString;
    }
}
