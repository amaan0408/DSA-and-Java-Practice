package com.algorithmsPractice.random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
    public int[] diplicateElements(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                list.add(entry.getKey());
            }
        }
        int arr [] = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            arr[j]=list.get(j);
        }
        return arr;
    }
    public static void main(String[] args) {
        FindDuplicates obj = new FindDuplicates();
        int arr[] = {1,2,3,1,4,4,8,2};

        int [] result = obj.diplicateElements(arr);
        for(int j=0; j<result.length; j++){
            System.out.println(result[j]);
        }
    }
}
