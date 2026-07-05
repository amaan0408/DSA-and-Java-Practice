package com.algorithmsPractice.random;

import java.util.ArrayList;
import java.util.List;

public class Sum_Of_Integers_With_Max_Range {
    public int DigitRange(int a){
        int rem = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(a!=0){
            rem = a%10;
            if(rem>max){
                max = rem;
            }
            if(rem<min){
                min = rem;
            }
            a=a/10;
        }
        return max-min;
    }
    public int maxDigitRange(int[] nums) {
        int maxVar = -1;
        int sum=0;
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int range = DigitRange(nums[i]);
            if(range>maxVar){
                maxVar = range;
                sum = nums[i];
            }
            else if(range == maxVar){
                result.add(nums[i]);
                sum += nums[i];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
Sum_Of_Integers_With_Max_Range nums = new Sum_Of_Integers_With_Max_Range();
int arr [] = {5724,111,350};
int reult = nums.maxDigitRange(arr);
        System.out.println(reult);
    }
}
