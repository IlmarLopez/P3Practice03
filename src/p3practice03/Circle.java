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
public class Circle implements Enclosure {
  double radius;
  Circle(double radius) {
    this.radius = radius;
  } 

    @Override
    public double perimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }
}
