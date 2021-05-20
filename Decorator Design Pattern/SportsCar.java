package com.decorator; 

public class SportsCar extends CarDecorator { 
 
 public SportsCar(Car c) { 
 super(c); 
 } 
 
 @Override 
 public void assemble(){ 
 super.assemble(); 
 System.out.print(" Adding features of Sports Car."); 
 } 
 }

 
public class CarDecorator implements Car { 

 protected Car car; 
 
 public CarDecorator(Car c){ 
 this.car=c; 
 } 
 
 @Override 
 public void assemble() { 
 this.car.assemble(); 
 } 
 
 }
