/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author 19301261
 */
public class Rectangle extends Shape {

    public String shapeName = "Rectangle";
    public double length;
    public double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public void area() {
        double a = length * width;
    }

    public String toString() {
        return this.shapeName;
    }
}
