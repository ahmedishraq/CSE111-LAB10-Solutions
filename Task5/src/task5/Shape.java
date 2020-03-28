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
public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape() {

    }

    public Shape(String c, boolean f) {
        this.color = c;
        this.filled = f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean f) {
        filled = f;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}
