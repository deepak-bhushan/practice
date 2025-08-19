package org.example.ds.array;
/*
maximum-consecutive-ones-or-zeros-in-a-binary-array/

 [0, 1, 0, 1, 1, 1, 1]
  o/p -4
 */
public class MaximumConsecutiveZeroOne {
    static int maxConsecBits(int[] arr) {
        if (arr.length == 0) return 0;
        int maxCounter = 0;
        int count = 1;
          for(int i=1; i<arr.length; i++) {
              if(arr[i] == arr[i-1]) {
                  count++;
              }else
              {
                  maxCounter = Math.max(maxCounter, count);
              }
          }
          return Math.max(maxCounter, count);
    }

    public static void main(String[] args) {
      int result=maxConsecBits(new int[]{1,0,1,0});
      System.out.println(result);
    }
}



