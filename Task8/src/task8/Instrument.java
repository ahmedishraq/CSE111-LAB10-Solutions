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
public abstract class Instrument {

     private String name;

    public Instrument(String a) {
        this.name = a;
    }

    public abstract void play();

    public abstract void adjust();

    public void compose() {
        System.out.println("Composing a song with the "+name);
    }

}
