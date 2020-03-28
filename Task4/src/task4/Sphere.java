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
public class Sphere extends Shape {

    public String shapeName = "Sphere";
    public double radius;

    public Sphere(double r) {
        this.radius = r;
    }

    public void area() {
        double a = 4 * Math.PI * radius * radius;
    }

    public String toString() {
        return this.shapeName;
    }
}
