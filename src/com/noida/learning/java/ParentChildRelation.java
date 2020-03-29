package com.noida.learning.java;

class Parent {
    // Declaring instance variable by name `x`
    String x = "Parent`s Instance Variable";

    public void print() {
        System.out.println(x);
    }
}

class Child extends Parent
{

    // Hiding Parent class's variable `x` by defining a variable in child class with same name.
    String x = "Child`s Instance Variable";

    @Override
    public void print() {
        System.out.print(x);

        // If we still want to access variable from super class, we do that by using `super.x`
        System.out.print(", " + super.x + "\n");
    }
}

public class ParentChildRelation {
    public static void main(String[] args) {
        Parent p1  = new Child();
        //System.out.println();
        System.out.println(((Child)p1).x);
    }




}

