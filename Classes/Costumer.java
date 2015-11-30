/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Bruger
 */
public class Costumer {
    
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private int age;

    public Costumer(String firstName, String lastName, int phoneNumber, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String costumerDetails() {
        return "Costumer{" + "firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", age=" + age + '}';
    }

    @Override
    public String toString() {
        return "Costumer{" + "firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", age=" + age + '}';
    }
    
    
 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
}