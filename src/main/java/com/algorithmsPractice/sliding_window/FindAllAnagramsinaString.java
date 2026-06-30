package com.algorithmsPractice.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> pattern = new HashMap<>();
        HashMap<Character, Integer> text = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<p.length(); i++){
            char ch = p.charAt(i);
            if(pattern.containsKey(p.charAt(i))){
                pattern.put(ch, pattern.get(ch)+1);
            }
            else {
                pattern.put(ch, 1);
            }
        }
        int winSize = 0;
        int left=0;

        for(int right = 0; right<s.length(); right++){
            char ch2 = s.charAt(right);
            if(text.containsKey(p.charAt(right))){
                text.put(ch2, pattern.get(ch2)+1);
            }
            else {
                text.put(ch2, 1);
            }
            winSize = right-left+1;
            while((winSize>p.length())){
             char ch = s.charAt(left);
             text.remove(ch, text.get(ch)-1);
             if(text.get(ch)==0){
                 text.remove(ch);
             }
             left++;
            }
            if(pattern.equals(text)){
             result.add(left);
            }
        }
return result;
    }
}
