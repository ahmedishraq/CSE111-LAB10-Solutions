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
public class MovableCircle extends MovablePoint implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xs, int ys, int r) {
        super(x, y, xs, ys);
        radius = r;
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
        return "MovableCircle";
    }
}
