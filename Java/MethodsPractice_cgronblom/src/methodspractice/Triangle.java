/************************
 * Title:
 * Date:
 * Author: Cyrus Gronblom
 * Purpose:
 * **********************
 */

package methodspractice;


public class Triangle extends Shape {

    public Triangle(double width, double height) {
        super(width, height);
    }
    
    double getArea() {
        return 0.5f * dblWidth * dblHeight;
    }

}
