package com.algorithmsPractice.BetterWinsOutright;

import java.util.HashMap;
import java.util.Map;

public class Highest_Frequency_2 {
    //Given an array, return the number that appears most often.
    // If two or more numbers tie for the highest frequency, return the largest Highest_Frequency_2 among them
    public int largestElement(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int bestNumber = 0;
        int bestFreq = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>bestFreq){
                bestNumber = entry.getKey();
                bestFreq = entry.getValue();
            }
            else if (entry.getValue() == bestFreq){
                if(entry.getKey()>bestNumber){
                    bestNumber = entry.getKey();
                }
            }
        }
        return bestNumber;
    }
    public static void main(String[] args) {
        Highest_Frequency_2 obj = new Highest_Frequency_2();
        int arr[] = {9,9,2,2,4,4,8,8,6,6,5,5,123,123};

        int result = obj.largestElement(arr);
        System.out.println("The most repeated element is: " + result);
    }
}
