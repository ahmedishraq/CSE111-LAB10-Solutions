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
public class Paint{
    public double coverage;
    public double amount(Shape r){
    double ammount= r.area()/coverage;
    return ammount;
    }
}
