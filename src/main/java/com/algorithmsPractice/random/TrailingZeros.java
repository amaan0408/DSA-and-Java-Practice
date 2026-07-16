package com.algorithmsPractice.random;

public class TrailingZeros {
    public int trailingZeroes(int n) {
        int fact = 1;
        int count = 0;

        while(n>=5){
         count = count + n/5;
         n = n/5;
        }
        return count;
    }
    public static void main(String[] args) {
        TrailingZeros nums = new TrailingZeros();
        int result = nums.trailingZeroes(13);
        System.out.println(result);
    }
}
