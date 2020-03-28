/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9;

/**
 *
 * @author DOLPHIN
 */
import java.util.Scanner;

public class Task9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.setName("Ishraq");
        s1.setID("19301261");
        s1.addStudent(s1);
        Student s2 = new Student();
        s2.setName("Ahmed");
        s2.setID("0155");
        s2.addStudent(s2);

    }

}
