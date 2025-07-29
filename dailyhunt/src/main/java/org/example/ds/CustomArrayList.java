package org.example.ds;

import java.util.Arrays;


/*
 -size
 -ensureCapacity
 -add element
 -deleteelement
 -index
 -clear

 */




public class CustomArrayList <E>
{
   private int size;
   private Object [] element;
   private int DEFAULT_CAPACITY=2;
   public CustomArrayList()
   {
       element = new Object[DEFAULT_CAPACITY];
   }

   public  CustomArrayList(int size)
   {

   }
   // If array is full then extend the array
   public void ensureCapacity()
   {
    int newSize= element.length*2+1;
    element= Arrays.copyOf(element, newSize);
   }

   // Add an element
   public void add(Object e){
       if(size==element.length){
           ensureCapacity();
       }
       element[size++]=e;
   }

   @SuppressWarnings("Unhecked")
   public Object getIndex(int index)
   {
       if(index<0 || index>size){
           throw new IndexOutOfBoundsException("Index Out of Bounds" +index+ " size" +size);
       }
       return (E) element[index];
   }

    public int size()
    {
       return size;
    }

    // remove an element from list

    public E remove(int index)
    {
       if(index<0 || index>size){
           throw new IndexOutOfBoundsException("Index Out of Bounds" +index+ " size" +size);
       }
       E oldValue=(E) element[index];
       int numbermoved=size-index-1;
       if(numbermoved>0){
           System.arraycopy(element,index+1,element,index,numbermoved);
       }
       element[--size]=null;
       return oldValue;
    }

     public void clear(){
       for(int i=0;i<size;i++){
           element[i]=null;
       }
       size=0;
     }

    public boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    // Method to get the index of an element
    public int indexOf(E e) {
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (element[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (e.equals(element[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
     CustomArrayList<Integer> list = new CustomArrayList<Integer>();
     list.add(1);
     list.add(2);
        int size1 = list.size;
        System.out.println("size1: " + size1);
        list.remove(1);
        System.out.println(list.size);
        list.add(3);
        list.add(4);
        System.out.println(list.size);
    }


}
