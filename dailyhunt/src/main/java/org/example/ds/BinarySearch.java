package org.example.ds;
/*
 This searching algorithm is based on devide on conquer if
  first it will check mid of the array ,
  if not found ,den it will check either element is greater than mid if yes
  den it will traverse to right if element is less then it will traverse to
  left side of the array.It's only applicable for sorted array.
 */
public class BinarySearch {

    public int getIndex (int data, int array[]){
        int left=0;
        int right=array.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(array[mid]==data){
                return mid;
            }
            else if(array[mid]>data){
               right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        System.out.println("Not found");
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs=new BinarySearch();
        int arr[]=new int[]{10,20,30,40,50,60,70,80};
        int result=bs.getIndex(21,arr);
        System.out.println(result);
    }
}
