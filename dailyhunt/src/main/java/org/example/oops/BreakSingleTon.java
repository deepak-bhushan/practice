package org.example.oops;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 We have to break a singleton class using reflection
 Create a constructor array which will responsible for get list of all the declared
 method,once it will fetch after through that constructor array when we call the
 newInstance it will create the new instance
 */
public class BreakSingleTon {
    private static BreakSingleTon instance=null;
    private BreakSingleTon(){

    }
    public static BreakSingleTon getInstance(){
        synchronized (BreakSingleTon.class) {
            if (instance == null) {
                instance = new BreakSingleTon();
            }
        }
        return instance;
    }

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        BreakSingleTon obj=BreakSingleTon.getInstance();
        BreakSingleTon obj1=BreakSingleTon.getInstance();
        BreakSingleTon obj2=null;

        Constructor [] constructor= BreakSingleTon.class.getDeclaredConstructors();
        for (Constructor c : constructor) {
            c.setAccessible(true);
            obj2=(BreakSingleTon) c.newInstance();
        }

        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
