/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lav10t7;

/**
 *
 * @author 19301261
 */
public class Circle implements GeomatricObject {

    protected double radius = 1.0;

    public Circle(double a) {
        radius = a;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
}
