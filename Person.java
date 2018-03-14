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
 public class Person {
    
    String firstName;
    String lastName;
    int age;
    
    //default constructor 
    Person(){
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 1;
    }
    
    //parametrized constructor
    
    Person(String fNm, String lNm, int age){
        this.firstName = fNm;
        this.lastName = lNm;
        this.age = age; 
        
    }
    //copy constructor
    Person(Person object){//when we want to set property that already have
        this.firstName = object.firstName;
        this.lastName = object.lastName;
        this.age = object.age;
    }
    void readData(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first Name : ");
        this.firstName = input.nextLine();
        
        System.out.println("Enter last Name : ");
        this.lastName = input.nextLine();
        
        System.out.println("Enter age : ");
        this.age = input.nextInt();
    }
    
    void displayData(){
        
        System.out.println("First Name : " + this.firstName);
      System.out.println("Last Name : " + this.lastName);  
      System.out.println("Age : " + this.age);
    }
    
}
