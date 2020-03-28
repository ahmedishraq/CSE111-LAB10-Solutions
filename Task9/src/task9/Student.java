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
public class Student implements StInterface {

    public String name;
    public String ID;
    public String address;
    public int count = 0;

    public Student() {
        count++;
    }

    public void setName(String a) {
        this.name = a;
    }

    public void setID(String i) {
        this.ID = i;
    }

    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.ID;
    }

    Student[] arr = new Student[count];

    public void addStudent(Student s) {
        String temp;
        String[] name = new String[count];
        for (int i = 0; i < name.length; i++) {
            name[i] = s.getName();
        }
        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i].compareTo(name[j]) > 0) {
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        //  System.out.println("Name: " + s.getName()+ " ID: " + s.getID());
        for (int i = 0; i < name.length - 1; i++) {
            System.out.println("Name: "+name[i]+" ID: "+s.getID());
        }
        System.out.println(name[name.length - 1]);
    }
}
