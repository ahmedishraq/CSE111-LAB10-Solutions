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
public class Author {

    private String name;
    private String email;
    public char gender;
    public boolean ismale = true;

    public Author(String n, String e, char g) {
        this.name = n;
        this.email = e;
        this.gender = g;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public char getGender() {
        return this.gender;
    }

    public String toString() {
        return this.name + "(" + this.gender + ") at" + this.email;
    }
}
