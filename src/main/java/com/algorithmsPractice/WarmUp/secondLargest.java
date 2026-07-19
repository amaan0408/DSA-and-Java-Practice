package com.algorithmsPractice.WarmUp;

import com.algorithmsPractice.random.Sum_Of_Integers_With_Max_Range;

public class secondLargest {
    public int secondBiggest (int arr[] ){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // arr = [1,2,34,6,92];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                min = max;
                max = arr[i];
            }
            else if (arr[i]<max){
                if(arr[i]>min){
                min = arr[i];
                }
            }
        }
        return min;

    }
    public static void main(String[] args) {
        secondLargest nums = new secondLargest();
        int arr [] = {12,6,2,1};
        int result = nums.secondBiggest(arr);
        System.out.println(result);
    }
}
