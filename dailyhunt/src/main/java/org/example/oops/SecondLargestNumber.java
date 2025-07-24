package org.example.oops;

public class SecondLargestNumber {
   public int secondLargest (int arr[]){
       int first;
       int second;
       first=second=0;
       for(int i=0;i<arr.length;i++){
           if(arr.length<1){
               System.out.println("There is no more than 1 element in this array");
           }
           if (arr[i]>first){
               second=first;
               first=arr[i];
           }
           if(arr[i]>second && arr[i]<first){
               second=arr[i];
           }
       }
       return second;
   }
    public static void main(String[] args) {
          SecondLargestNumber slobj=new SecondLargestNumber();
          int result=slobj.secondLargest(new int [] {11,13,58,90,89,91,90});
        System.out.println("Second Largest Number " +result);
    }
}
