/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author 19301261
 */
public class Book  {

    private String name;
    private double price;
    private int qty;
    private Author author;

    public Book(String n, Author e, double p, int q) {
        this.name = n;
        this.author = e;
        this.price = p;
        this.qty = q;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public void setQty(int q) {
        this.qty = q;
    }

    public int getQty() {
        return this.qty;
    }
    public String toString(){
    return this.name+author.toString();
    }
}
