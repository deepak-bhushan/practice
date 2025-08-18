package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Employee1 {
    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    private int id;
    private String name;
    private int age;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;

    public Employee1(int id, String name, int age, Double salary, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    private Double salary;

    public static void main(String[] args) {
        Employee1 emp1=new Employee1(1,"ABC",21,3243423423.1,"HR");
        Employee1 emp2=new Employee1(2,"DEF",27,8243423423.1,"IT");
        Employee1 emp3=new Employee1(3,"GHI",20,243423423.1,"D");
        Employee1 emp4=new Employee1(4,"JKL",29,9243423423.1,"PI");
        Employee1 emp5=new Employee1(5,"MNO",31,7243423423.1,"QA");
        Employee1 emp6=new Employee1(6,"JKL",64,6243423423.1,"AQ");
        Employee1 emp7=new Employee1(7,"PQR",21,5243423423.1,"FINANCE");

        ArrayList<Employee1> employee1s = new ArrayList<>();
        employee1s.add(emp1);
        employee1s.add(emp2);
        employee1s.add(emp3);
        employee1s.add(emp4);
        employee1s.add(emp5);
        employee1s.add(emp6);
        employee1s.add(emp7);

        Optional<Employee1> secondhighestsalary= employee1s.stream()
                .sorted(Comparator.comparingDouble(Employee1::getSalary).reversed()).skip(1 ).findFirst();

        System.out.println(secondhighestsalary.get().getSalary());

        Map <String, List<Employee1>> groupByDepartment=employee1s.stream()
                .collect(Collectors.groupingBy(Employee1::getDepartment));

        System.out.println(groupByDepartment);
    }
}
