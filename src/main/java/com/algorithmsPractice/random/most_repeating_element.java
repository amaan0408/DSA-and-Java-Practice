package com.algorithmsPractice.random;

import java.util.HashMap;
import java.util.Map;

public class most_repeating_element {
    public int mostRepeated(int a[]){
        int count = 0;
        int maxCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<a.length; i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }
            else {
                map.put(a[i],1);
            }
        }
        int element = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            count = entry.getValue();
            if(entry.getValue()>maxCount){
                maxCount = count;
                element = entry.getKey();
            }
        }
        return element;
    }


    public static void main(String[] args) {
        most_repeating_element obj = new most_repeating_element();
        int arr[] = {1, 2, 3, 4, 5, 1, 1, 1, 2, 2, 2, 2};

        int result = obj.mostRepeated(arr);
        System.out.println("The most repeated element is: " + result);
    }
}