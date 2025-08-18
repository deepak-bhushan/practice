package org.example.java17;

public record Student (String name, int age) {
    public static void main(String[] args) {
        Student s1=new Student("Sam",25);
        Student s2=new Student("Sam",25);
        System.out.println(s1.name+" "+s2.name);
        System.out.println(s1.age+" "+s2.age);
        System.out.println(s1==s2);
    }
}
