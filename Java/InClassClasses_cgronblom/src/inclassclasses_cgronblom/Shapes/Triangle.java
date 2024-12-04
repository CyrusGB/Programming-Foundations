package inclassclasses_cgronblom.Shapes;

public class Triangle {

    private double intX1, intY1, intX2, intY2, intX3, intY3;
    
    /** Point Accessors
     * @param intX/Y# Change point variables
     * @return the desired variable
     */

    public double getIntX1() {
        return intX1;
    }
    
    public void setIntX1(double intX1) {
        this.intX1 = intX1;
    }
    
    public double getIntY1() {
        return intY1;
    }
    
    public void setIntY1(double intY1) {
        this.intY1 = intY1;
    }
    
    public double getIntX2() {
        return intX2;
    }
    
    public void setIntX2(double intX2) {
        this.intX2 = intX2;
    }
    
    public double getIntY2() {
        return intY2;
    }
    
    public void setIntY2(double intY2) {
        this.intY2 = intY2;
    }
    
    public double getIntX3() {
        return intX3;
    }
    
    public void setIntX3(double intX3) {
        this.intX3 = intX3;
    }
    
    public double getIntY3() {
        return intY3;
    }
    
    public void setIntY3(double intY3) {
        this.intY3 = intY3;
    }
    
    /** Create new triangle
     * Positions of points
     * @param intX1 x1
     * @param intY1 y1
     * 
     * @param intX2 x2
     * @param intY2 y2
     * 
     * @param intX3 x3
     * @param intY3 y3
     */
    public Triangle(double intX1, double intY1, double intX2, double intY2, double intX3, double intY3) {
        this.intX1 = intX1;
        this.intY1 = intY1;
        this.intX2 = intX2;
        this.intY2 = intY2;
        this.intX3 = intX3;
        this.intY3 = intY3;
    }

    /** Calculate the area of the triangle
     * @return the area of the triangle
     */
    public double calculateTriangle(){
        return .5 * Math.abs(getIntX1() * (getIntY2() - getIntY3()) + getIntX3() * (getIntY1() - getIntY2()));
    }

    // Formatted output
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
