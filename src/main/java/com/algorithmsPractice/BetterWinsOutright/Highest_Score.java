package com.algorithmsPractice.BetterWinsOutright;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class Highest_Score {
    //You're given an array of scores for players standing in a line
    // Return the index of the player with the highest score.
    // If multiple players tie for the highest score, return the index of the one standing earliest (smallest index).
public int highestScore (int nums []){
// nums [] = {12,34,45,67,89,9};

    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<nums.length; i++){
        map.put(nums[i], i);
    }
    int highest = 0;
    int index = 0;
    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        if(entry.getKey()>highest){
            highest = entry.getKey();
            index = entry.getValue();
        }
        else if(entry.getKey() == highest){
            if(entry.getValue()<index){
                index = entry.getValue();
            }
        }
    }
    return index;
}
}
