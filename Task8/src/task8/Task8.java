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
public class Task8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guitar g1 = new Guitar("Guitar");
        g1.play();
        g1.adjust();
        g1.compose();
        Keyboard k1 = new Keyboard("Keyboard");
        k1.play();
        k1.adjust();
        k1.compose();
        Violin v1 = new Violin("Violin");
        v1.play();
        v1.adjust();
        v1.compose();
    }

}
