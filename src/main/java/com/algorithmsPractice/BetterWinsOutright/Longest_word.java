package com.algorithmsPractice.BetterWinsOutright;

public class Longest_word {
    //3. Longest word, ties broken by shortest word
    //Given an array of strings, return the longest word.
    // If multiple words share the maximum length, return the one that is lexicographically smallest
    // (i.e., comes first alphabetically).
    public String highestScore(String str[]) {

        int maxLen = -1;
        String result = "";
        for(int i=0; i<str.length; i++){
            String temp = str[i];
            if(temp.length()>maxLen){
            result = temp;
            maxLen=temp.length();
            }
            else if(temp.length() == maxLen){
             if(temp.charAt(i)-'a' < result.charAt(i)-'a'){
                 result = temp;
             }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Longest_word obj = new Longest_word();
        String arr[] = {"cat", "bat", "rat"};

        String result = obj.highestScore(arr);
        System.out.println("The longest String is : " + result);
    }
}
