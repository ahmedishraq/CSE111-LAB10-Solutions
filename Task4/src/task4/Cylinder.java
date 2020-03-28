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
public class Cylinder extends Shape {

    public String shapeName = "Sphere";
    public double radius;
    public double height;

    public Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    public void area() {
        double a = Math.PI * radius * radius * height;
    }

    public String toString() {
        return this.shapeName;
    }
}
