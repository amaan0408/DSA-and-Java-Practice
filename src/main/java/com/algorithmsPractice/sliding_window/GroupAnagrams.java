package com.algorithmsPractice.sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char ch [] = strs[i].toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            String original = strs[i];
            if(map.containsKey(sorted)){
                List<String> group = map.get(sorted);
                group.add(original);
            }
            else {
                List<String> group = new ArrayList<>();
                group.add(original);
                map.put(sorted, group);
            }
        }
        return new ArrayList<>(map.values());
    }
}
