package com.algorithmsPractice.HashMap;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_the_Difference {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (int j = 0; j < t.length(); j++) {
            char ch2 = t.charAt(j);
            map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            if(entry.getValue()!=map1.getOrDefault(entry.getKey(), 0)){
                return entry.getKey();
            }
        }

        return '\0';
    }
}
