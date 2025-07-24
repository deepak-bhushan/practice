package org.example.oops;
/*
 - create private constructor
 - Create single instance only
 - When we will try to create a object instead of creating new object it will return existing instance
 */
public class SingleTon {
    private SingleTon() {
        System.out.println("SingleTon instance created");
    }

    private static SingleTon instance=null;
    public static SingleTon getInstance(){
       synchronized (SingleTon.class) {
           if (instance == null) {
               instance = new SingleTon();
           }
       }
       return instance;
    }

    public static void main(String[] args) {
        SingleTon instance=SingleTon.getInstance();
        System.out.println(instance.hashCode());
        SingleTon instance2=SingleTon.getInstance();
        System.out.println(instance2.hashCode());
    }
}
