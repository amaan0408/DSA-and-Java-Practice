package com.algorithmsPractice.HashMap.Mapping;

import java.util.HashMap;

public class Word_Pattern {
    public boolean wordPattern(String pattern, String s) {
    // pattern = "abba", s = "dog cat cat dog"
        String [] str = s.split(" ");

        HashMap<Character, String> map = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
         if(map.containsKey(pattern.charAt(i))){
          if((map.get(pattern.charAt(i))!=str[i])){
           return false;
          }
         }
         else {
             if(!map.containsValue(str[i])){
                 map.put(pattern.charAt(i), str[i]);
             }
             else {
                 return false;
             }
         }
        }
return true;
    }
}
