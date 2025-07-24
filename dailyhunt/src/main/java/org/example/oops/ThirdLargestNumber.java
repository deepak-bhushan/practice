package org.example.oops;

public class ThirdLargestNumber {

    public int third(int arr[]) {
        int first=0;
        int second=0;
        int third=0;

        if (arr.length < 2) {
            System.out.println("ThirdLargestNumber Error");
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]>first) {
               third=second;
               second=first;
               first=arr[i];
           }
           if(arr[i]>second && arr[i]<first){
               third=second;
               second=arr[i];
           }
           if(arr[i]>third && arr[i]<second){
               third=arr[i];
           }
        }
        return third;
    }
    public static void main(String[] args) {
        ThirdLargestNumber thirdobj=new ThirdLargestNumber();
        int result=thirdobj.third(new int [] {11,13,58,90,89,98,90,105,100});
        System.out.println("Third Largest Number " +result);
    }
}
