package org.example.oops;
/*
 this one is used for "how to break a single ton class using serialization"
 for example serilization is used for convert object to byte stream
  for saving a data in file or send over the network.during deserialization it return
  a new instance .so it break the singleton class
  ---fix
  To overcome this issue we have to implement read resolve method

   protected object readResolve () { return instance; }

 */
import java.io.*;

public class BreakSingTonUsingSerialization implements Serializable {
    private static BreakSingTonUsingSerialization instance=null;
    private BreakSingTonUsingSerialization(){
        System.out.println("BreakSingTonUsingSerialization");
    }
    public static BreakSingTonUsingSerialization getInstance(){
        synchronized (BreakSingTonUsingSerialization.class) {
            if (instance == null) {
                instance = new BreakSingTonUsingSerialization();
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        BreakSingTonUsingSerialization b1=BreakSingTonUsingSerialization.getInstance();
        System.out.println(b1.hashCode());
        BreakSingTonUsingSerialization b2=BreakSingTonUsingSerialization.getInstance();
        System.out.println(b2.hashCode());
        BreakSingTonUsingSerialization b3=null;
        System.out.println("Singleton class break using Serialization");
        try{
            ObjectOutput out=new ObjectOutputStream(new FileOutputStream("abc.txt"));
            out.writeObject(b1);
            out.close();
            ObjectInput in=new ObjectInputStream(new FileInputStream("abc.txt"));
            b3=(BreakSingTonUsingSerialization)in.readObject();
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(b3.hashCode());

    }
}
