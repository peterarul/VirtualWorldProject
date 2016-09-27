/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author arulpeter
 */
public class MyClone {
    private String firstName;
    private String lastName;
    public MyClone(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setFirstName(String fname){
        this.firstName = fname;
    }
    public void setLastName(String lname){
        this.lastName = lname;
    }
    public String introduction(){
        return "Hi My name is "+this.lastName+", "+this.firstName+".\nI'm currently working at NBC";
    }
}
