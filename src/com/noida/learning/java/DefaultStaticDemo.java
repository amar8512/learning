package com.noida.learning.java;

interface X{
  default void m1(){
      System.out.println("Hi in interface X");
  }
  static void m2(){
      System.out.println("In interface x,  m2 method , hi!!!");
  }
}

class Y implements X{
   public void m1(){
       X.super.m1();
        System.out.println("I Hello world in implementing class Y");
    }
    static void m2(){
        System.out.println("In class X");
    }
}


public class DefaultStaticDemo {
    public static void main(String[] args) {
         Y y = new Y();
         y.m1();
         X.m2();
    }
}
