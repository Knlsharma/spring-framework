package com.mycompany.spring_demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author knl
 */
public class Employee implements Coach {  
private int id;  
private String name;  
  
public Employee()
{System.out.println("def cons");}  
  
public Employee(int id)
{this.id = id;}  
  
public Employee(String name) 
{  this.name = name;}  
  
public Employee(int id, String name) {  
    this.id = id;  
    this.name = name;  
}  
  
@Override
public void show(){  
    System.out.println(id+" "+name);  
}  

    @Override
    public String getDailyWorkout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDailyFortune() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}  
