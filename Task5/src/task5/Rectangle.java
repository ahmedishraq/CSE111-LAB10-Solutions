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
public  class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {

    }

    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    public Rectangle(double w, double l, String c, boolean f) {
        super(c, f);
        width = w;
        length = l;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        length = l;
    }

    public double getArea() {
        return getWidth() * getLength();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getLength());
    }

    public String toString() {
        return "Rectangle";
    }
}
