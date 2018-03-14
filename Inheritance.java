/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author macstudent
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person one = new Person();
        //one.readData();
        one.displayData();
        
        
        Person sumdeep = new Person("Sumdeep", "Kaur",10);
        sumdeep.displayData();
        
        Person sumdeep2 = new Person(sumdeep);
        sumdeep2.displayData();
        
       // Employee e1 = new Employee(1450.87);
       // e1.display();
        
        Employee e2 = new Employee();
        e2.display();
        
        e2.firstName = "SK";
        e2.lastName = "Kaur";
        e2.age = 21;
        e2.salary = 1000;
        //e2.displayData();
        e2.display();
        //System.out.println("Last Name : " + e2.lastName);
        //method overriding when we have same paramertized within both parent and subclass  priority is given to subclass method 
        Employee e3 = new Employee("SK","Kaur",100,1996);
        e3.read();
        e3.display();
        
    }
    
}

