package com.example.pattern.day5_prototype.impl;

import com.example.pattern.day5_prototype.Shape;

public class Square extends Shape {
   public Square(){
     type = "Square";
   }
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}