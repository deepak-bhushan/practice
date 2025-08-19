package org.example.ds.array;
/*
Reverse an Array in groups of given size
Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 3
Output: [3, 2, 1, 6, 5, 4, 8, 7]
 */
public class ReverseAnArrayGroupOfGIvenSize {

public static void reverseInGroups(int arr[], int n,int k){
    n=arr.length;
    for(int i=0;i<n;i+=k){
        int left=i;
        int right=Math.min(i+k-1,n-1);
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        reverseInGroups(arr, arr.length, k);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
