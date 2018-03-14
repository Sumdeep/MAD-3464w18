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
import java.util.Scanner;
public class Employee extends Person {//when we want to relate person and employee class
    double salary;
    
    Employee(){
        super();
        this.salary = 14;
        
    }
    Employee(String fname, String lname, int age, double pay){
        super(fname,lname,age);
        this.salary = pay;
        
    }
    void read(){
       // super.read();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter salary : ");
        this.salary = input.nextDouble();
    }
    void display(){
       // super.display();
        System.out.println("Salary : "  + this.salary);
    }
}
