package com.algorithmsPractice.random;

public class PrefixSum {
    public int [] prefix(int nums[]){
        int sum = 0;
        int prefix [] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix [i-1] + nums[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        PrefixSum obj = new PrefixSum();
        int arr[] = {1,2,3,4,5};

        int [] result = obj.prefix(arr);
        for(int j=0; j<result.length; j++){
            System.out.print(result[j]+" ");
        }
    }
}
