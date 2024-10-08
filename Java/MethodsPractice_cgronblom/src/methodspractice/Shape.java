/************************
 * Title:
 * Date:
 * Author: Cyrus Gronblom
 * Purpose:
 * **********************
 */

package methodspractice;


public abstract class Shape {
    
    double dblWidth;
    double dblHeight;
    
    public Shape(double width, double height){
        this.dblWidth = width;
        this.dblHeight = height;
    }
    
    public double getWidth(){
        return dblWidth;
    }
    
    public double getHeight(){
        return dblHeight;
    }
    
    abstract double getArea();
}
