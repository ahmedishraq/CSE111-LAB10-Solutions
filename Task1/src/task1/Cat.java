/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author 19301261
 */
public class Cat extends Animal {

    public String noise = "Meow";

    public Cat(String name) {
        super.name = name;
    }

    public void makeNoise() {
        System.out.println(name + " sound is " + noise);
    }
}
