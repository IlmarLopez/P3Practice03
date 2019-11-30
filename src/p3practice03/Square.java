/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3practice03;

/**
 *
 * @author developer
 */
public class Square implements Enclosure {
    double width;
    Square(double width) {
      this.width = width;
    }

    @Override
    public double perimeter() {
        return 4 * width;
    }

    @Override
    public double area() {
        return width * width;
    }
}
