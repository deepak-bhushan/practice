package org.example.oops;

import java.util.HashMap;

/*
Hashmap implementation
 */
public class Student {
    private int id;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 31*id+id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null && getClass()!=obj.getClass()){
            return false;
        }
        Student student = (Student) obj;
        return id == student.id;
    }

    private String name;

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

    public static void main(String[] args) {
        Student student1 = new Student(1, "Deepak");
        Student student2 = new Student(2, "DE");
        Student student3 = new Student(1, "PILA");

        // Creating a HashMap with Student as key and grade as value
        HashMap<Student, String> hm = new HashMap<>();

        // Adding elements to the HashMap
        hm.put(student1, "A Grade");
        hm.put(student2, "B Grade");

        // Retrieving values using keys
        System.out.println(" student1: " + hm.get(student1));
        System.out.println(" student2: " + hm.get(student2));

        // Using student3 (same id as student1) to retrieve value
        System.out.println("Grade of student3: " + hm.get(student3));
    }
}
