package org.example.ds.array;
/*
find-subarray-with-given-sum-in-array-of-integers/
 */
public class GivenSum {

    public  static void get(int arr[], int sum) {
        int n=arr.length-1;
        int curr_sum=0;
        for(int i=0;i<n;i++){
            curr_sum=0;
            for(int j=i+1;j<n;j++){
                curr_sum=curr_sum+arr[j];
                if(curr_sum==sum){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }


    public static void main (String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;

        // Function call
        get(arr,  sum);
    }
}
