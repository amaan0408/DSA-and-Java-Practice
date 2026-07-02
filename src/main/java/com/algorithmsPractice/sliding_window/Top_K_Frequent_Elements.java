package com.algorithmsPractice.sliding_window;

import java.util.*;

public class Top_K_Frequent_Elements {

        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int n : nums){
                if(map.containsKey(n)){
                    map.put(n, map.get(n)+1);
                }
                else {
                    map.put(n, 1);
                }
            }
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                list.add(entry);
            }
            Collections.sort(list, (a, b) -> Integer.compare(b.getValue(), a.getValue()));
            int result []= new int [k];
            for(int i=0; i<k; i++){
                result[i] = list.get(i).getKey();
            }
            return result;
        }

}
