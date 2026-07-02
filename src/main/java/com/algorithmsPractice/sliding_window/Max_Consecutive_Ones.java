package com.algorithmsPractice.sliding_window;

public class Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {

        int left = 0;
        int count = 0;
        int maxCount = count;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 1) {
                count = right - left + 1;
                maxCount = Math.max(maxCount, count);
            } else {
                while (left <= right) {
                    left++;
                }
            }
        }
        return maxCount;
    }
}
