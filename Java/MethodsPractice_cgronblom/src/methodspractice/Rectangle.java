/************************
 * Title: Rectangle Class
 * Date: 10/8/24
 * Author: Cyrus Gronblom
 * Purpose: Store data about a rectangle
 * **********************
 */

package methodspractice;


public class Rectangle extends Shape{

    public Rectangle(double width, double height) {
        super(width, height);
    }

    double getArea() {
        return dblWidth * dblHeight;
    }
}
