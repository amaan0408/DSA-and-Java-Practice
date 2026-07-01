package com.algorithmsPractice.random;

import java.util.List;

public class mostRepeatingCharacter {
    public void mostRepeatingChar(String str) {
        int fre[] = new int[26];
        int maxCount = -1;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            fre[ch - 'a']++;
        }
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            char ch2 = str.charAt(i);
            if (fre[ch2 - 'a'] > maxCount) {
                maxCount = fre[ch2 - 'a'];
                ch = ch2;
            }
        }
        System.out.println(maxCount);
        System.out.println(ch);

    }
}
