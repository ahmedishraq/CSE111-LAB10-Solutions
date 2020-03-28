/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task8;

/**
 *
 * @author DOLPHIN
 */
public class Violin extends Instrument {

    public Violin(String a) {
        super(a);
    }

    public void play() {
        System.out.println("In the playing method of Violin");
    }

    public void adjust() {
        System.out.println("The tune is adjusting in Violin");
    }
}
