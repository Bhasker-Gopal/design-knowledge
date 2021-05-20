package com.decorator; 

public class SportsCar extends CarDecorator { 
 
 public LuxuryCar(Car c) { 
 super(c); 
 } 
 
 @Override 
 public void assemble(){ 
 super.assemble(); 
 System.out.print(" Adding features of Luxury Car."); 
 } 
 }
