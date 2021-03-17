/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author user
 */
public class Person {

    String fName;
    String lName;
    String stuId;
    String stuStatus;
    
    public Person(String fName, String lName, String stuId, String stuStatus){
        this.fName=fName;
        this.lName=lName;
        this.stuId=stuId;
        this.stuStatus=stuStatus;
}
    public static void main(String[] args) {
        // TODO code application logic here
        Person student=new Person("Lisa", "Palombo","123456789", "Active" );
        
        System.out.println("Student Name = " +student.fName+" "+student.lName);
        System.out.println("Student ID = " +student.stuId);
        System.out.println("Student Status = " +student.stuStatus);
      
    }
    
}
