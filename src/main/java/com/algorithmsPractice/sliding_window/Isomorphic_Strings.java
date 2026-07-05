package com.algorithmsPractice.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        char [] word1 = s.toCharArray();
        char [] word2 = t.toCharArray();
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
         char c1 = s.charAt(i);
         char c2 = t.charAt(i);
         if(map1.containsKey(c1)){
             if(map1.get(c1)!=c2 && map2.get(c2)!=c1){
               return false;
             }
         }
         else {
             map1.put(c1, c2);
             map2.put(c2, c1);
         }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
