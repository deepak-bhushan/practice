package org.example.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1=new Employee(1,"a",20,120098888.1);
        Employee e2=new Employee(1,"b",30,1920098888.1);
        Employee e3=new Employee(1,"c",40,210098888.1);
        Employee e4=new Employee(1,"d",50,340098888.1);
        Employee e5=new Employee(1,"e",60,820098888.1);
        Employee e6=new Employee(1,"f",70,620098888.1);
        Employee e7=new Employee(1,"g",90,520098888.1);

        ArrayList<Employee> employees=new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e1);

        Optional<Employee> secondHighestSalary= employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

        System.out.println("Second highest salary "+secondHighestSalary.get().name);
        System.out.println(employees.size());
        System.out.println("After removing duplicate element ");

        ArrayList<Employee> employees1WithoutDuplicates= (ArrayList<Employee>) employees.stream()
                .collect(Collectors.toCollection(() ->new TreeSet<>(Comparator.comparing(Employee::getName)).stream().collect(Collectors.toList())));

        ArrayList<Employee> employees1WithoutDuplicates1= (ArrayList<Employee>) employees.stream()
                        .distinct().collect(Collectors.toList());
        System.out.println(employees1WithoutDuplicates1.size());


        System.out.println(employees1WithoutDuplicates.size());
    }
}
