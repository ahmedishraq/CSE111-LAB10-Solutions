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
public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String c, boolean f) {
        super(side, side, c, f);
    }

    public double getSide() {
        return super.width;
    }

    public void setSide(double side) {
        super.width = side;
    }

    public void setWidth(double w) {
        super.width = w;
    }

    public void setLength(double l) {
        super.length = l;
    }

    public String toString() {
        return "Square";
    }
}
