package org.example.ds.array;

import java.util.HashMap;

public class GIvenSumArray {
    public static void subArraySum(int[] arr, int n,
                                   int sum){
     n=arr.length-1;
     int curr_sum=0;

        HashMap<Integer,Integer> targetmap=new HashMap<>();
        for(int i=0;i<n;i++){
            curr_sum+=arr[i];

        }

    }

    public static void main(String[] args) {

    }
}
