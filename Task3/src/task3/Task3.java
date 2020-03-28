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
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author a1 = new Author("Ishraq ", "ishraqahmedbd@gmail.com", 'f');
        Book b1= new Book("How to controll java ",a1, 100.20,2);
        //a1.setEmail("asdfhsdjkf");
        System.out.println(b1);
        
    }
    
}
