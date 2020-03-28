/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10t6;

/**
 *
 * @author 19301261
 */
public class MovablePoint implements Movable {

    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xs, int ys) {
        x = x;
        y = y;
        xSpeed = xs;
        ySpeed = ys;
    }

    public void moveUp() {
    }

    public void moveDown() {
    }

    public void moveRight() {
    }

    public void moveLeft() {
    }

    public String toString() {
        return "MovablePoint";
    }
}
