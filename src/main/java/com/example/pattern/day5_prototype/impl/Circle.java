package com.example.pattern.day5_prototype.impl;

import com.example.pattern.day5_prototype.Shape;

public class Circle extends Shape {
   public Circle() {
      type = "Circle";
   }
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }

}