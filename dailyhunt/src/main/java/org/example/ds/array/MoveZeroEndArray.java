package org.example.ds.array;

/*

 */
public class MoveZeroEndArray {

    public static void pushArray(int arr[]){
        int n=arr.length-1;
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        while(j<n){
            temp[j++]=0;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
