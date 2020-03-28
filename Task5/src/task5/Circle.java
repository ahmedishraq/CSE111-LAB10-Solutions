/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

/**
 *
 * @author DOLPHIN
 */
public  class Circle extends Shape {

    protected double radius;

    public Circle() {

    }

    public Circle(double r) {
        radius = r;
    }

    public Circle(double r, String c, boolean f) {
        super(c, f);
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public String toString() {
        return "Circle";                           // have to confirm what string will be return  in this toString method.
    }
}
