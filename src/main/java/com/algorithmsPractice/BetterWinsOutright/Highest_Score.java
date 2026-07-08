package com.algorithmsPractice.BetterWinsOutright;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class Highest_Score {
    //You're given an array of scores for players standing in a line
    // Return the index of the player with the highest score.
    // If multiple players tie for the highest score, return the index of the one standing earliest (smallest index).
    public int highestScore(int nums[]) {
        // Edge case: if array is empty
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int highest = nums[0];
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            // Using strictly '>' ensures that if there's a tie,
            // we keep the earliest index (the one we found first).
            if (nums[i] > highest) {
                highest = nums[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Highest_Score obj = new Highest_Score();
        int arr[] = {10,10,2};

        int result = obj.highestScore(arr);
        System.out.println("The most repeated element is: " + result);
    }
}
