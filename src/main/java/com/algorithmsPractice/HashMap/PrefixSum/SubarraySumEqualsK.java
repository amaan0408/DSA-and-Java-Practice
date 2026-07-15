package com.algorithmsPractice.HashMap.PrefixSum;

import java.util.HashMap;

public class SubarraySumEqualsK {

        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            int count = 0;
            int prefixSum = 0;
            for (int i = 0; i < nums.length; i++) {
                prefixSum = prefixSum + nums[i];
                int requiredPrefix = prefixSum - k;
                if (map.containsKey(requiredPrefix)) {
                    count = count + map.get(requiredPrefix);
                }
                map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            }
            return count;
        }

}
