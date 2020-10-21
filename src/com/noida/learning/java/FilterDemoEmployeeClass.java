package com.noida.learning.java;

import java.util.*;

class Employee{
    private int age ;
    private int empId;
    String name ;

    Employee(int age,int empId,String name){
        this.age = age;
        this.empId = empId;
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public void  setName(String name){
        this.name=name;
    }

    @Override public String toString() {
        return "Employee{" + "age=" + age + ", empId=" + empId + ", name='"
                + name + '\'' + '}';
    }
}
public class FilterDemoEmployeeClass {
    public static void main(String[] args) {
        Employee ep1 = new Employee(50,001,"Dinesh");
        Employee ep2 = new Employee(35,002,"Suresh");
        Employee ep3 = new Employee(31,003,"Akhilesh");
        Employee ep4 = new Employee(25,004,"Kamlesh");
        List<Employee>  employeeList = new ArrayList<>();
        employeeList.add(ep1);
        employeeList.add(ep2);
        employeeList.add(ep3);
        employeeList.add(ep4);

        employeeList.stream().filter(i->i.getEmpId()%2==0).forEach(System.out::println);
        System.out.println(employeeList.stream().filter(i->i.getAge()<35).count());
        //     numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        HashMap<Integer,Employee> hashMap = new HashMap<>();
        hashMap.put(777,ep1);
        hashMap.put(451,ep2);
        hashMap.put(213,ep3);
        hashMap.put(502,ep4);
        Set<Map.Entry<Integer,Employee>> entrySet=hashMap.entrySet();
        System.out.println( entrySet.stream().filter(d->d.getValue().getAge()>20).count());
        entrySet.stream().filter(d->d.getValue().getAge()<50).forEach(System.out::println);

    }
}
