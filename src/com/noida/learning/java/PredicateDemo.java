package com.noida.learning.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Employees {
    String name;
    Integer age;
    Integer weight;

    public Employees(String name, Integer age, Integer weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getWeight() {
        return weight;
    }

    public String toString() {
        return "Name of  the employee is " + this.getName() + " age is " + this.getAge()
                + " and Weight is " + this.getWeight();
    }

}

final class EmployeesUtilClass {
    public static void printEmployees(Predicate<Employees> employeesPredicate,
                                      ArrayList<Employees> employeesList) {
        for (Employees e : employeesList) {
            if (employeesPredicate.test(e)) {
                System.out.println("Seems like " + e.getName() + " is not eligible for management program");
            }
        }
    }
}

public class PredicateDemo {
    public static void main(String[] args) {

        ArrayList<Employees> employeesList = new ArrayList<Employees>();
        Employees e1 = new Employees("Vivek", 24, 61);
        Employees e2 = new Employees("Varun", 47, 80);
        Employees e3 = new Employees("Amit", 23, 49);
        Employees e4 = new Employees("Tarun", 24, 76);
        Employees e5 = new Employees("Karan", 25, 74);

        employeesList.add(e1);
        employeesList.add(e2);
        employeesList.add(e3);
        employeesList.add(e4);
        employeesList.add(e5);

        Predicate<Employees> employeesPredicate = (Employees e) -> {
            if (e.getAge() < 25) {
                return true;
            }
            return false;
        };
        Consumer<Employees> employeesConsumer = (Employees e)->{
            System.out.println(" "+e.getName());

        };
        EmployeesUtilClass.printEmployees(employeesPredicate, employeesList);

        Predicate<Employees> employeesRemovalPredicate =  e-> e.getName().startsWith("V");

        employeesList.removeIf(employeesRemovalPredicate);

        employeesList.forEach(employeesConsumer);


    }
}
