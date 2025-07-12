package org.example.ds;

import java.lang.reflect.Array;
import java.util.Optional;
import java.util.OptionalInt;
/*
 Time complexity is O(n)
 */
public class LinearSearch {

    public int getIndex (int arr[],int data){
        OptionalInt index;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                return i;
            }
        }
        System.out.println("Not found");
        return -1;
    }

    public static void main(String[] args) {
        int [] arr=new int[]{11,1,2,14,15,17,18,19,21};
        LinearSearch obj=new LinearSearch();
        int result=obj.getIndex(arr,29);
        System.out.println(result);
    }
}
